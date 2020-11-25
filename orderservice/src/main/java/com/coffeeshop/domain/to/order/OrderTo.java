package com.coffeeshop.domain.to.order;

import com.coffeeshop.domain.order.OrderStatus;
import com.coffeeshop.domain.to.IdTo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderTo extends IdTo {

    private IdTo shop;

    private List<OrderItemTo> items;

    private String notes;

    private Double amount;

    private Double discount;

    private Double total;

    private Double totalPayment;

    private OrderStatus status;

}
