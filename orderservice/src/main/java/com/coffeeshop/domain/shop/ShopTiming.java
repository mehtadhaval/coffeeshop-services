package com.coffeeshop.domain.shop;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class ShopTiming {

    @Id
    private Long id;

    @NotNull
    private String openTime;

    @NotNull
    private String closeTime;

    @ManyToOne
    private Shop shop;
}
