package com.chq.design.pattern.structural.proxy.cglibproxy;

import com.chq.design.pattern.structural.proxy.IOrderService;
import com.chq.design.pattern.structural.proxy.Order;
import com.chq.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * cglib动态代理
 * @Date 2020/3/1 22:38
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {
        // 测试cglib动态代理,可以代理类和接口
        IOrderService orderService = (IOrderService) new CgLibOrderServiceDynamicProxy().newInstance(new OrderServiceImpl());
        Order order = new Order(new Object(), 1);
        orderService.saveOrder(order);
    }
}
