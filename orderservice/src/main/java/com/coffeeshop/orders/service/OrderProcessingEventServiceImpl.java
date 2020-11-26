package com.coffeeshop.orders.service;

import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.order.OrderProcessingEvent;
import com.coffeeshop.domain.repository.order.OrderProcessingEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Transactional
@Component
public class OrderProcessingEventServiceImpl implements OrderProcessingEventService {

    @Autowired
    private OrderProcessingEventRepository orderProcessingEventRepository;

    @Override
    public OrderProcessingEvent createOrderStatusEvent(Order order) {
        OrderProcessingEvent orderProcessingEvent = new OrderProcessingEvent();
        orderProcessingEvent.setOrder(order);
        orderProcessingEvent.setStatus(order.getStatus());
        orderProcessingEvent.setProcessedBy(order.getUser());
        return orderProcessingEventRepository.save(orderProcessingEvent);
    }
}
