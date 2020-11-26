package com.coffeeshop.domain.shop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "shop_timings")
@EntityListeners(AuditingEntityListener.class)
public class ShopTiming {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String openTime;

    @NotNull
    private String closeTime;

    @ManyToOne
    private Shop shop;

    @NotNull
    @CreatedDate
    private Date createdAt;

    @NotNull
    @LastModifiedDate
    private Date modifiedAt;
}
