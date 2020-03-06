package com.chq.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

import java.util.Observable;

/**
 * 产品
 * 角色：被观察者
 */
public class Product {

    private int price;
    private String name;

    private EventBus eventBus;

    public Product(int price, String name, EventBus eventBus) {
        this.price = price;
        this.name = name;
        this.eventBus = eventBus;
    }

    public void updatePrice(int newPrice) {
        eventBus.post("你关注的" + name + "价格变动，由" + price + "变为" + newPrice);
    }

    public void register(Customer customer) {
        eventBus.register(customer);
    }

    public void unregister(Customer customer) {
        eventBus.unregister(customer);
    }

}
