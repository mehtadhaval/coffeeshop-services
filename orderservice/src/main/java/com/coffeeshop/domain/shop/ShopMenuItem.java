package com.coffeeshop.domain.shop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "shop_menu_items")
@Getter
@Setter
@Table(name = "shop_menu_items")
@EntityListeners(AuditingEntityListener.class)
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
    private Date createdAt;

    @NotNull
    @LastModifiedDate
    private Date modifiedAt;
}
