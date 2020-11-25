package com.coffeeshop.domain.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
public class OrderQueue {
    @Id
    private Long id;

    @OneToOne
    private Order order;

    @NotNull
    private Integer queueNo;

    @NotNull
    private ZonedDateTime createdAt;
}
