package com.coffeeshop.domain.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class OrderPayment {

    @Id
    private Long id;

    @ManyToOne
    private Order order;

    @NotNull
    private PaymentMode paymentMode;

    @NotNull
    private Double amount;
}
