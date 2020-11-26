package com.coffeeshop.orders.service;

import com.coffeeshop.domain.order.Order;
import com.coffeeshop.domain.order.ShopQueue;
import com.coffeeshop.domain.order.ShopQueueOrder;
import com.coffeeshop.domain.repository.order.ShopQueueOrderRepository;
import com.coffeeshop.domain.repository.order.ShopQueueRepository;
import com.coffeeshop.domain.repository.shop.ShopRepository;
import com.coffeeshop.domain.shop.Shop;
import com.coffeeshop.orders.exception.AllQueuesAtCapacityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Component
public class OrderQueueServiceImpl implements OrderQueueService {

    @Autowired
    private ShopQueueRepository shopQueueRepository;

    @Autowired
    private ShopQueueOrderRepository shopQueueOrderRepository;

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public void putOrderInQueue(Order order) {
        Shop shop = shopRepository.getOne(order.getShop().getId());

        List<ShopQueue> queues = shopQueueRepository.findAllByShopIdAndActiveTrue(order.getShop().getId());

        List<Pair<ShopQueue, Long>> eligibleQueues = queues.stream().map(shopQueue -> {
            Long shopQueueOrdersCount = shopQueueOrderRepository.countAllByShopQueueIdAndActiveTrue(shopQueue.getId());
            return Pair.of(shopQueue, shopQueueOrdersCount);
        }).filter(shopQueueLongPair ->
                shopQueueLongPair.getSecond() < shop.getQueueSize()
        ).sorted(Comparator.comparing(Pair::getSecond)).collect(Collectors.toList());

        if (eligibleQueues.isEmpty()) {
            throw new AllQueuesAtCapacityException();
        }

        Pair<ShopQueue, Long> assignedQueueCountPair = eligibleQueues.get(0);

        ShopQueueOrder shopQueueOrder = new ShopQueueOrder();
        shopQueueOrder.setOrder(order);
        shopQueueOrder.setShopQueue(assignedQueueCountPair.getFirst());
        shopQueueOrder.setActive(true);
        order.setQueue(shopQueueOrder);
    }
}
