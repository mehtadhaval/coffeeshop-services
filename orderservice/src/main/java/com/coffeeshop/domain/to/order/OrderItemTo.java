package com.coffeeshop.domain.to.order;

import com.coffeeshop.domain.to.IdTo;
import com.coffeeshop.domain.to.shop.ShopMenuItemTo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemTo extends IdTo {

    private ShopMenuItemTo shopMenuItem;

    private Integer quantity;

    private Double price;

    private String notes;

}
