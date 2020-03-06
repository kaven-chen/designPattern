package com.chq.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * 客户
 * 角色：观察者
 * 观察目标：product（产品）
 */
public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Subscribe
    public void update(Object o) {
        String content = (String) o;
        System.out.println("尊敬的用户" + name + ",你好，" + content);
    }
}
