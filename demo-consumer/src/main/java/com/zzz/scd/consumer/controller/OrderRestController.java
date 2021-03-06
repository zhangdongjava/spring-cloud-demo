package com.zzz.scd.consumer.controller;

import com.zzz.scd.consumer.entity.Order;
import com.zzz.scd.consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    public Order get(@PathVariable("id") int id){
        return orderService.findById(id);
    }
}
