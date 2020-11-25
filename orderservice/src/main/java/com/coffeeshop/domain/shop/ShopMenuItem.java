package com.coffeeshop.domain.shop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity(name = "shop_menu_items")
@Getter
@Setter
@Table(name = "shop_menu_items")
public class ShopMenuItem {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ShopMenuGroup menuGroup;

    @NotNull
    private String name;

    private String description;

    private Double price;

    @NotNull
    @CreatedDate
    private ZonedDateTime createdAt;

    @NotNull
    @LastModifiedDate
    private ZonedDateTime modifiedAt;
}
