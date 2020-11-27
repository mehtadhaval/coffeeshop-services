package com.coffeeshop.domain.mapper.order;

import com.coffeeshop.domain.mapper.shop.ShopMapper;
import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.order.OrderItem;
import com.coffeeshop.domain.to.order.OrderItemTo;
import com.coffeeshop.domain.to.order.OrderTo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ShopMapper.class})
public interface OrderMapper {

    // When creating an order, following field are calculated on server side
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "amount", ignore = true)
    @Mapping(target = "discount", ignore = true)
    @Mapping(target = "total", ignore = true)
    @Mapping(target = "totalPayment", ignore = true)
    @Mapping(target = "status", ignore = true)
    Order convertToOrder(OrderTo orderTo);

    OrderTo convertToOrderTo(Order order);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "price", ignore = true)
    OrderItem convertToOrderItem(OrderItemTo orderItemTo);

    OrderItemTo convertToOrderItemTo(OrderItem orderItem);
}
