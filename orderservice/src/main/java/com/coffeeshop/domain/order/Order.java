package com.coffeeshop.domain.order;

import com.coffeeshop.domain.User;
import com.coffeeshop.domain.shop.Shop;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private Long processingDuration;

    @OneToOne
    private ShopQueueOrder queue;

    @OneToMany
    private List<OrderPayment> payments;

    private Double totalPayment;

    @NotNull
    @CreatedDate
    private ZonedDateTime createdAt;

    @NotNull
    @LastModifiedDate
    private ZonedDateTime modifiedAt;
}
