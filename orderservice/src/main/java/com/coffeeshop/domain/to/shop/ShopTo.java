package com.coffeeshop.domain.to.shop;

import com.coffeeshop.domain.to.AddressTo;
import com.coffeeshop.domain.to.ContactDetailsTo;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class ShopTo {

    @NotNull
    private Long id;

    private String locationName;

    private List<ContactDetailsTo> contactDetails;

    private List<AddressTo> addresses;

    private Integer queueCount;

    private Integer queueSize;

    private List<ShopTimingTo> timings;
}
