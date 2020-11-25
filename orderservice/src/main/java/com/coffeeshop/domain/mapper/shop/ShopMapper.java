package com.coffeeshop.domain.mapper.shop;

import com.coffeeshop.domain.shop.ShopMenuItem;
import com.coffeeshop.domain.to.shop.ShopMenuItemTo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShopMapper {

    ShopMenuItem convertToShopMenuItem(ShopMenuItemTo shopMenuItemTo);

    ShopMenuItemTo convertToShopMenuItemTo(ShopMenuItem shopMenuItem);
}
