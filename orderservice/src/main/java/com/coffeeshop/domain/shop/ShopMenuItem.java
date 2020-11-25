package com.coffeeshop.domain.shop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class ShopMenuItem {
    @Id
    private Long id;

    @ManyToOne
    private ShopMenu menu;

    @NotNull
    private String name;

    private String description;

    private Double price;
}
