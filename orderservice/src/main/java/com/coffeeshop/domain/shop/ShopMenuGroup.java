package com.coffeeshop.domain.shop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity(name = "shop_menu_groups")
@Getter
@Setter
@Table(name = "shop_menu_groups")
@EntityListeners(AuditingEntityListener.class)
public class ShopMenuGroup {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ShopMenu menu;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "menuGroup")
    private List<ShopMenuItem> items;

    private String notes;

    @NotNull
    @CreatedDate
    private Date createdAt;

    @NotNull
    @LastModifiedDate
    private Date modifiedAt;

}
