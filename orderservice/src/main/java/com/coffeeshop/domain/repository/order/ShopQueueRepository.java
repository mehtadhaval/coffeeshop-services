package com.coffeeshop.domain.repository.order;

import com.coffeeshop.domain.order.ShopQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopQueueRepository extends JpaRepository<ShopQueue, Long> {
    List<ShopQueue> findAllByShopIdAndActiveTrue(Long shopId);
}
