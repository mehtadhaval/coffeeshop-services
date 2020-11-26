package com.coffeeshop.domain.to.shop;

import com.coffeeshop.domain.Address;
import com.coffeeshop.domain.ContactDetails;
import com.coffeeshop.domain.shop.ShopTiming;
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

    private List<ContactDetails> contactDetails;

    private List<Address> addresses;

    private Integer queueCount;

    private Integer queueSize;

    private List<ShopTiming> timings;
}
