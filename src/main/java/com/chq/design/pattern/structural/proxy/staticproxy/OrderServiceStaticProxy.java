package com.chq.design.pattern.structural.proxy.staticproxy;

import com.chq.design.pattern.structural.proxy.IOrderService;
import com.chq.design.pattern.structural.proxy.Order;
import com.chq.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @Description
 * @Date 2020/3/1 21:03
 * @Created by ChenQiang
 */
public class OrderServiceStaticProxy {

    public IOrderService orderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);
        afterMethod(order);
        return result;
    }

    public void beforeMethod(Order order) {
        // 处理目标方法执行前业务逻辑。。。
        System.out.println("静态代理：before method");
    }

    public void afterMethod(Order order) {
        // 处理目标方法执行后业务逻辑。。。
        System.out.println("静态代理：after method");
    }


}
