package com.coffeeshop.domain.order;

import com.coffeeshop.domain.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
public class OrderProcessingEvent {

    @Id
    private Long id;

    @ManyToOne
    private Order order;

    @NotNull
    private OrderStatus status;

    @ManyToOne
    private User processedBy;

    @NotNull
    private ZonedDateTime createdAt;
}
