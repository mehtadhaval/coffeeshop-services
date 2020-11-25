package com.coffeeshop.domain.to.shop;

import com.coffeeshop.domain.to.IdTo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopMenuItemTo extends IdTo {

    private String name;

    private String description;

    private Double price;

}
