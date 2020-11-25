package com.coffeeshop.domain.shop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
@Table(name = "shop_timings")
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
    private ZonedDateTime createdAt;

    @NotNull
    @LastModifiedDate
    private ZonedDateTime modifiedAt;
}
