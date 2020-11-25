package com.coffeeshop.domain.to;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class IdTo implements To {

    @NotNull
    private Long id;
}
