package com.coffeeshop.domain.order;

import com.coffeeshop.domain.shop.Shop;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@Table(name = "shop_queues")
public class ShopQueue {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Shop shop;

    @NotNull
    private Integer queueNo;

    @NotNull
    private boolean active;

    @NotNull
    private ZonedDateTime createdAt;

    @NotNull
    private ZonedDateTime modifiedAt;
}
