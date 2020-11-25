package com.coffeeshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity(name = "addresses")
@Getter
@Setter
@Table(name = "addresses")
public class Address {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String addressLine1;

    private String addressLine2;

    private String City;

    private String zip;

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    @NotNull
    private ZonedDateTime createdAt;

    @NotNull
    private ZonedDateTime modifiedAt;
}
