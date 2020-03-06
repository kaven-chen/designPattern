package com.chq.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 产品
 * 角色：被观察者
 */
public class Product extends Observable {

    private int price;
    private String name;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void updatePrice(int newPrice) {
        setChanged();
        notifyObservers("你关注的" + name + "价格变动，由" + price + "变为" + newPrice);
    }

}
