package com.example.pr7.data.Repository;


import com.example.pr7.data.Models.Item;

public class Repository {

    private Item item;

    public Repository(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}