package com.coffeeshop.domain.repository.order;

import com.coffeeshop.domain.order.ShopQueueOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopQueueOrderRepository extends JpaRepository<ShopQueueOrder, Long> {
    long countAllByShopQueueIdAndActiveTrue(Long shopQueueId);

    Page<ShopQueueOrder> findAllByShopQueueIdAndActiveFalse(Long shopQueueId, Pageable pageable);

    List<ShopQueueOrder> findAllByShopQueueIdAndIdLessThanEqualAndActiveTrue(Long shopQueueId, Long id);
}
