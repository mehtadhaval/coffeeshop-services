package com.coffeeshop.orders.service;

import com.coffeeshop.domain.User;
import com.coffeeshop.domain.order.Order;

import java.util.Optional;

public interface OrderService {
    Order save(Order order, User user);

    Optional<Order> getForUser(Long orderId, Long userId);
}
