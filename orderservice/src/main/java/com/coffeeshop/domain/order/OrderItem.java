package com.coffeeshop.domain.order;

import com.coffeeshop.domain.shop.ShopMenuItem;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "order_items")
@EntityListeners(AuditingEntityListener.class)
public class OrderItem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull
    private Order order;

    @ManyToOne
    private ShopMenuItem shopMenuItem;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double price;

    private String notes;

    @NotNull
    @CreatedDate
    private Date createdAt;

    @NotNull
    @LastModifiedDate
    private Date modifiedAt;
}
