package com.coffeeshop.domain.order;

import com.coffeeshop.domain.shop.ShopMenuItem;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class OrderItem {

    @Id
    private Long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private ShopMenuItem shopMenuItem;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double price;

    private String notes;
}
