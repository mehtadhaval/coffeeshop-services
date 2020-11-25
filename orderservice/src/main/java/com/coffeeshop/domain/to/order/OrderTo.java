package com.coffeeshop.domain.to.order;

import com.coffeeshop.domain.order.OrderStatus;
import com.coffeeshop.domain.to.IdTo;
import com.coffeeshop.domain.to.shop.ShopTo;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class OrderTo extends IdTo {

    @NotNull
    private ShopTo shop;

    @NotEmpty
    private List<OrderItemTo> items;

    private String notes;

    private Double amount;

    private Double discount;

    private Double total;

    private Double totalPayment;

    private OrderStatus status;

}
