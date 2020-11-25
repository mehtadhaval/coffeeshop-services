package com.coffeeshop.domain.shop;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
public class Shop {

    @Id
    private Long id;

    @NotNull
    private String locationName;

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    @NotNull
    private Integer queueCount;

    @NotNull
    private Integer queueSize;

    @OneToMany
    private List<ShopTiming> timings;

}
