package com.coffeeshop.domain.to;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressTo {
    private Long id;

    private String addressLine1;

    private String addressLine2;

    private String City;

    private String zip;

    private Double latitude;

    private Double longitude;
}
