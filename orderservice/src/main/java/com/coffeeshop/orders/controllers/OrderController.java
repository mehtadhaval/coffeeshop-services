package com.coffeeshop.orders.controllers;

import com.coffeeshop.domain.User;
import com.coffeeshop.domain.mapper.order.OrderMapper;
import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.to.order.OrderTo;
import com.coffeeshop.orders.exception.NotFoundException;
import com.coffeeshop.orders.service.OrderQueueService;
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

    @Autowired
    private OrderQueueService orderQueueService;

    @PostMapping
    public ResponseEntity<OrderTo> create(@Valid @RequestBody OrderTo orderTo, User user) {
        Order order = orderService.save(orderMapper.convertToOrder(orderTo), user);

        OrderTo savedOrderTo = orderMapper.convertToOrderTo(order);
        savedOrderTo.setQueuePosition(orderQueueService.calculateWaitTime(savedOrderTo.getId()));

        return new ResponseEntity<>(savedOrderTo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderTo> get(@PathVariable long id, User user) {
        Order order = orderService.getForUser(id, user.getId()).orElseThrow(NotFoundException::new);

        OrderTo orderTo = orderMapper.convertToOrderTo(order);
        orderTo.setQueuePosition(orderQueueService.calculateWaitTime(orderTo.getId()));

        return new ResponseEntity<>(orderTo, HttpStatus.OK);
    }

}
