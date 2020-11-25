package com.coffeeshop.domain.shop;


import com.coffeeshop.domain.Address;
import com.coffeeshop.domain.ContactDetails;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "shops")
public class Shop {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String locationName;

    @ManyToMany
    private List<ContactDetails> contactDetails;

    @ManyToMany
    private List<Address> addresses;

    @NotNull
    private Integer queueCount;

    @NotNull
    private Integer queueSize;

    @OneToMany
    private List<ShopTiming> timings;

    @NotNull
    private ZonedDateTime createdAt;

    @NotNull
    private ZonedDateTime modifiedAt;
}
