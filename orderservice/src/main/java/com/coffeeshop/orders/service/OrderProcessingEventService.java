package com.coffeeshop.orders.service;

import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.order.OrderProcessingEvent;

public interface OrderProcessingEventService {
    OrderProcessingEvent createOrderStatusEvent(Order order);
}
