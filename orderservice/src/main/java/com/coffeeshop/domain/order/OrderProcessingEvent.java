package com.coffeeshop.domain.order;

import com.coffeeshop.domain.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@Table(name = "order_processing_events")
public class OrderProcessingEvent {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Order order;

    @NotNull
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    private User processedBy;

    @NotNull
    private ZonedDateTime createdAt;

    @NotNull
    private ZonedDateTime modifiedAt;
}
