package com.coffeeshop.domain.mapper.shop;

import com.coffeeshop.domain.shop.ShopMenuItem;
import com.coffeeshop.domain.to.shop.ShopMenuItemTo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ShopMapper {

    @Mapping(target = "name", ignore = true)
    @Mapping(target = "price", ignore = true)
    @Mapping(target = "description", ignore = true)
    ShopMenuItem convertToShopMenuItem(ShopMenuItemTo shopMenuItemTo);

    ShopMenuItemTo convertToShopMenuItemTo(ShopMenuItem shopMenuItem);
}
