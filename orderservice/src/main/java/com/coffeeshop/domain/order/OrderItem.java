package com.coffeeshop.domain.order;

import com.coffeeshop.domain.shop.ShopMenuItem;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@Table(name = "order_items")
public class OrderItem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @NotNull
    private ZonedDateTime createdAt;

    @NotNull
    private ZonedDateTime modifiedAt;
}
