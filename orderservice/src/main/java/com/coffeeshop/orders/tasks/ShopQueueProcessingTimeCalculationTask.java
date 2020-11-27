package com.coffeeshop.orders.tasks;

import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.order.ShopQueue;
import com.coffeeshop.domain.order.ShopQueueOrder;
import com.coffeeshop.domain.repository.order.ShopQueueOrderRepository;
import com.coffeeshop.domain.repository.order.ShopQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopQueueProcessingTimeCalculationTask {

    @Value("${coffeeshop.queue.processingTime.orderCount:10}")
    private Integer orderCount;

    @Autowired
    private ShopQueueRepository shopQueueRepository;

    @Autowired
    private ShopQueueOrderRepository shopQueueOrderRepository;

    public void calculate(Long shopQueueId) {

        // TODO : Wire this. Can be called periodically using @Scheduled, or can be called at every order completion

        // To be called when an order has completed processing

        ShopQueue shopQueue = shopQueueRepository.getOne(shopQueueId);
        Pageable recentlyProcessedRequestsPagination = PageRequest.of(0, orderCount, Sort.by(Sort.Direction.DESC, "createdAt"));

        List<ShopQueueOrder> recentOrders = shopQueueOrderRepository
                .findAllByShopQueueIdAndActiveFalse(shopQueueId, recentlyProcessedRequestsPagination).getContent();

        if (recentOrders.isEmpty()) {
            return;
        }

        long orderItemsCount = recentOrders.stream()
                .map(ShopQueueOrder::getOrder)
                .mapToLong(order -> order.getItems().size())
                .sum();

        long totalProcessingTime = recentOrders.stream()
                .map(ShopQueueOrder::getOrder)
                .mapToLong(Order::getProcessingDuration).sum();

        shopQueue.setAvgProcessingDuration(totalProcessingTime / orderItemsCount);
    }
}
