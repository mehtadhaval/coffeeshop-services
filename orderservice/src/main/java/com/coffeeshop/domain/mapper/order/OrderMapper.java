package com.coffeeshop.domain.mapper.order;

import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.order.OrderItem;
import com.coffeeshop.domain.to.order.OrderItemTo;
import com.coffeeshop.domain.to.order.OrderTo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order convertToOrder(OrderTo orderTo);

    OrderTo convertToOrderTo(Order order);

    OrderItem convertToOrderItem(OrderItemTo orderItemTo);

    OrderItemTo convertToOrderItemTo(OrderItem orderItem);
}
