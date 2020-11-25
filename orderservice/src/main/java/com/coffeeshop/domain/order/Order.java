package com.coffeeshop.domain.order;

import com.coffeeshop.domain.User;
import com.coffeeshop.domain.shop.Shop;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
public class Order {

    @Id
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Shop shop;

    @OneToMany
    private List<OrderItem> items;

    private String notes;

    @NotNull
    private Double amount;

    private Double discount;

    @NotNull
    private Double total;

    @NotNull
    private OrderStatus status;

    @OneToMany
    private List<OrderPayment> payments;
}
