package com.coffeeshop.domain.repository.order;

import com.coffeeshop.domain.order.ShopQueueOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopQueueOrderRepository extends JpaRepository<ShopQueueOrder, Long> {
    long countAllByShopQueueIdAndActiveTrue(Long shopQueueId);
}
