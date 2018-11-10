package com.zzz.scd.provider.controller;

import com.zzz.scd.provider.entity.Item;
import com.zzz.scd.provider.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemRestController {

    private Logger logger = LoggerFactory.getLogger(ItemRestController.class);

    @Autowired
    private ItemService itemService;

    @GetMapping("{id}")
    public Item get(@PathVariable("id") int id){
        logger.info("查询商品:{}",id);
        return itemService.findById(id);
    }
}
