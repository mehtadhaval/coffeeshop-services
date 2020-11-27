package com.coffeeshop.domain.to.order;

import com.coffeeshop.domain.to.shop.ShopMenuItemTo;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class OrderItemTo {

    private Long id;

    @NotNull
    private ShopMenuItemTo shopMenuItem;

    @Min(1)
    @Max(50)
    private Integer quantity;

    private Double price;

    @Size(max = 255)
    private String notes;

}
