package com.coffeeshop.domain.repository.order;

import com.coffeeshop.domain.order.OrderProcessingEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProcessingEventRepository extends JpaRepository<OrderProcessingEvent, Long> {
}
