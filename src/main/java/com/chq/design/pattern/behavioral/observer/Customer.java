package com.chq.design.pattern.behavioral.observer;

import javax.naming.Name;
import java.util.Observable;
import java.util.Observer;

/**
 * 客户
 * 角色：观察者
 * 观察目标：product（产品）
 */
public class Customer implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Product product = (Product) o;
        String updateContent = (String) arg;
        System.out.println("客户" + name + "收到产品价格变动信息：" + updateContent);
    }
}
