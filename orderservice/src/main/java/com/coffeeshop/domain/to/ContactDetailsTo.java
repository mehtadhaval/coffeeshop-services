package com.coffeeshop.domain.to;

import com.coffeeshop.domain.ContactType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDetailsTo {
    private Long id;

    private ContactType contactType;

    private String value;
}
