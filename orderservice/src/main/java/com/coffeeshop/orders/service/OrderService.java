package com.coffeeshop.orders.service;

import com.coffeeshop.domain.User;
import com.coffeeshop.domain.order.Order;

public interface OrderService {
    Order save(Order order, User user);
}
