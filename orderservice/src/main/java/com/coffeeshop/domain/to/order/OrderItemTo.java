package com.coffeeshop.domain.to.order;

import com.coffeeshop.domain.to.IdTo;
import com.coffeeshop.domain.to.shop.ShopMenuItemTo;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
public class OrderItemTo extends IdTo {

    @NotNull
    private ShopMenuItemTo shopMenuItem;

    @Positive
    private Integer quantity;

    private Double price;

    private String notes;

}
