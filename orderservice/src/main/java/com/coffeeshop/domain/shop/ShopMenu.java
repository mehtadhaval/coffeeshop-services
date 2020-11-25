package com.coffeeshop.domain.shop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class ShopMenu {

    @Id
    private Long id;

    @ManyToOne
    private Shop shop;

    @OneToMany
    private List<ShopMenuItem> items;
}
