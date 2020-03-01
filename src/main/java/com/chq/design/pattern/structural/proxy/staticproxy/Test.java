package com.chq.design.pattern.structural.proxy.staticproxy;

import com.chq.design.pattern.structural.proxy.Order;

/**
 * 静态代理
 *  需要显示的完成代理类和目标类的关系
 * @Date 2020/3/1 20:45
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {
        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
        Order order = new Order(new Object(), 1);
        proxy.saveOrder(order);
    }
}
