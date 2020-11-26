package com.coffeeshop.orders.service;

import com.coffeeshop.domain.User;
import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.order.OrderStatus;
import com.coffeeshop.domain.repository.order.OrderRepository;
import com.coffeeshop.domain.repository.shop.ShopMenuItemRepository;
import com.coffeeshop.domain.shop.ShopMenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ShopMenuItemRepository shopMenuItemRepository;

    @Autowired
    private OrderProcessingEventService orderProcessingEventService;

    @Autowired
    private OrderQueueService orderQueueService;

    public Order save(Order order, User user) {

        this.prepareOrderItems(order);
        this.processOrderDiscount(order);
        this.processOrderTotal(order);

        orderQueueService.putOrderInQueue(order);

        order.setUser(user);
        order.setStatus(OrderStatus.PLACED);
        Order savedOrder = orderRepository.save(order);

        orderProcessingEventService.createOrderStatusEvent(savedOrder);
        return savedOrder;
    }

    private void prepareOrderItems(Order order) {
        order.setAmount(0D);
        order.getItems().forEach(orderItem -> {
            ShopMenuItem shopMenuItem = shopMenuItemRepository.getOne(orderItem.getShopMenuItem().getId());
            Double price = shopMenuItem.getPrice() * orderItem.getQuantity();
            orderItem.setPrice(price);
            order.setAmount(price + order.getAmount());
            orderItem.setOrder(order);
        });
    }

    private void processOrderDiscount(Order order) {
        order.setDiscount(0D);
    }

    private void processOrderTotal(Order order) {
        order.setTotal(order.getAmount() - order.getDiscount());
    }
}
