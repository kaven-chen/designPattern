package com.chq.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * Guava EventBus 中的观察者模式
 * Guava 中的 EventBus 封装了友好的 “生产/消费模型”，通过非常简单的方式，实现了观察者模式中的监听注册，事件分发。
 *
 * 使用了 Guava EventBus 之后，如果需要订阅消息，不需要实现任何接口，只需在监听方法上加上 @Subscribe 注解即可，
 * EventBus 提供了 register 和 unregister 方法用于注册与取消注册事件，当 EventBus 调用 post 方法时将把事件分发给注册的对象
 *
 */
public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer("小红");
        Customer customer2 = new Customer("小黑");

        Product product = new Product(11, "录音带", new EventBus());
        product.register(customer1);
        product.register(customer2);

        product.updatePrice(33);
    }
}
