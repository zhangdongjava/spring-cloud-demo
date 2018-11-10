package com.zzz.scd.consumer.facade;

import com.zzz.scd.consumer.facade.impl.ItemServiceImpl;
import com.zzz.scd.provider.entity.Item;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "provider",fallback = ItemServiceImpl.class)
public interface ItemService {

    @GetMapping("item/{id}")
    Item findById(@PathVariable("id") int id);
}
