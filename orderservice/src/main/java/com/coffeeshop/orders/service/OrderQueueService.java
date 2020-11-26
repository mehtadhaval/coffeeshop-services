package com.coffeeshop.orders.service;

import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.to.order.QueuePositionTo;

public interface OrderQueueService {
    void putOrderInQueue(Order order);

    QueuePositionTo calculateWaitTime(Long orderId);
}
