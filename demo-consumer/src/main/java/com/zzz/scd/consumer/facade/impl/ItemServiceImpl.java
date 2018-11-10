package com.zzz.scd.consumer.facade.impl;

import com.zzz.scd.consumer.facade.ItemService;
import com.zzz.scd.provider.entity.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public Item findById(int id) {
        return new Item(id,"调用接口失败!",10);
    }
}














