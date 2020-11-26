package com.coffeeshop.domain.repository.shop;

import com.coffeeshop.domain.shop.ShopMenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopMenuItemRepository extends JpaRepository<ShopMenuItem, Long> {
}
