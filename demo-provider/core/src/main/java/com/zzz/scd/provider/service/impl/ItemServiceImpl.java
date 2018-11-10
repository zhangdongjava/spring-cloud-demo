package com.zzz.scd.provider.service.impl;

import com.zzz.scd.provider.entity.Item;
import com.zzz.scd.provider.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemServiceImpl implements ItemService {

    private static Map<Integer,Item> itemMap = new HashMap<>();
    static {
        for (int i = 1; i <=10; i++) {
            itemMap.put(i,new Item(i,"商品-"+i,i));
        }

    }

    @Override
    public Item findById(int id) {
        return itemMap.get(id);
    }
}
