package com.coffeeshop.domain.to.shop;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ShopMenuItemTo {

    @NotNull
    private Long id;

    private String name;

    private String description;

    private Double price;

}
