package com.coffeeshop.orders.service;

import com.coffeeshop.domain.order.Order;

public interface OrderQueueService {
    void putOrderInQueue(Order order);
}
