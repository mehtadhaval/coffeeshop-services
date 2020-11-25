package com.coffeeshop.domain.to.shop;

import com.coffeeshop.domain.Address;
import com.coffeeshop.domain.ContactDetails;
import com.coffeeshop.domain.shop.ShopTiming;
import com.coffeeshop.domain.to.IdTo;

import java.util.List;

public class ShopTo extends IdTo {

    private String locationName;

    private List<ContactDetails> contactDetails;

    private List<Address> addresses;

    private Integer queueCount;

    private Integer queueSize;

    private List<ShopTiming> timings;
}
