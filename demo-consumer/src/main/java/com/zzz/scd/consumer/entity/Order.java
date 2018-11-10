package com.zzz.scd.consumer.entity;

import com.zzz.scd.provider.entity.Item;

import java.util.List;

public class Order {

    private List<Item> items;

    private int id;

    private int[] itemId;

    public Order(int id,int ...itemId) {
        this.id = id;
        this.itemId = itemId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getItemId() {
        return itemId;
    }

    public void setItemId(int[] itemId) {
        this.itemId = itemId;
    }
}
