package com.chq.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式：
 *  定义：
 *      定义了对象之间的一对多依赖，让多个观察者同时监听某个主题对象，当主题对象发生变化时，多个观察者可以收到通知并更新
 *
 *  使用场景：
 *      关联行为场景，建立一套触发机制
 */
public class Test {

    public static void main(String[] args) {
        Observer customer1 = new Customer("小明");
        Observer customer2 = new Customer("小刚");

        Product product = new Product(10, "水晶杯");

        product.addObserver(customer1);
        product.addObserver(customer2);

        product.updatePrice(20);

    }

}
