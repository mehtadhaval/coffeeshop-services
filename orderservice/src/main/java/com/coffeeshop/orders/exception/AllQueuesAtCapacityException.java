package com.coffeeshop.orders.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AllQueuesAtCapacityException extends ResponseStatusException {

    public AllQueuesAtCapacityException() {
        super(HttpStatus.BAD_REQUEST);
    }
}
