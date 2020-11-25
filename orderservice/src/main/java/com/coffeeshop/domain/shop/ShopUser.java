package com.coffeeshop.domain.shop;

import com.coffeeshop.domain.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class ShopUser {

    @Id
    private Long id;

    @ManyToOne
    private Shop shop;

    @ManyToOne
    private User user;

    @NotNull
    private ShopUserRole role;

}
