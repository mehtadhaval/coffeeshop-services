package com.coffeeshop.domain.to.order;

import com.coffeeshop.domain.order.OrderStatus;
import com.coffeeshop.domain.to.shop.ShopTo;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
public class OrderTo {

    private Long id;

    @NotNull
    private ShopTo shop;

    @NotEmpty
    @Valid
    private List<OrderItemTo> items;

    @Size(max = 255)
    private String notes;

    private Double amount;

    private Double discount;

    private Double total;

    private Double totalPayment;

    private OrderStatus status;

    private QueuePositionTo queuePosition;

}
