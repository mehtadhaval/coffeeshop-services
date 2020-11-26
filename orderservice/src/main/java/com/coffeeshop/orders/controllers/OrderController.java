package com.coffeeshop.orders.controllers;

import com.coffeeshop.domain.User;
import com.coffeeshop.domain.mapper.order.OrderMapper;
import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.to.order.OrderTo;
import com.coffeeshop.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/orders")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderTo> create(@Valid @RequestBody OrderTo orderTo, User user) {
        Order order = orderMapper.convertToOrder(orderTo);

        Order savedOrder = orderService.save(order, user);

        OrderTo savedOrderTo = orderMapper.convertToOrderTo(savedOrder);

        return new ResponseEntity<>(savedOrderTo, HttpStatus.CREATED);
    }

}
