package com.zzz.scd.consumer.service.impl;

import com.zzz.scd.consumer.entity.Order;
import com.zzz.scd.consumer.facade.ItemService;
import com.zzz.scd.consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    private static Map<Integer,Order> itemMap = new HashMap<>();
    static {
        for (int i = 1; i <=5; i++) {
            itemMap.put(i,new Order(i,i+1,i+2,i+3));
        }
    }

    @Autowired
    private ItemService itemService;

    @Override
    public Order findById(int id) {
        Order order =  new Order(itemMap.get(id).getId(),itemMap.get(id).getItemId());
        order.setItems(new ArrayList<>(order.getItemId().length));
        for (int itemId : order.getItemId()) {
            order.getItems().add(itemService.findById(itemId));
        }
        return order;
    }
}
















