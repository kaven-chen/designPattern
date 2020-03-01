package com.chq.design.pattern.structural.proxy.dynamicproxy;

import com.chq.design.pattern.structural.proxy.IOrderService;
import com.chq.design.pattern.structural.proxy.Order;
import com.chq.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * 动态代理
 *
 * 源码解析：
 *  spring:
 *      DynamicAopProxy
 *      CglibAopProxy
 *  mybatis:
 *      MapperProxy
 * @Date 2020/3/1 21:13
 * @Created by ChenQiang
 */
public class Test {

    public static void main(String[] args) {
        // 动态代理测试,jdk动态代理只能代理接口
        /**
         * 为什么jdk动态代理只能代理接口:https://www.cnblogs.com/WeidLang/p/9857495.html
         * 原因：orderService实际上是$Proxy0代理类，发编译$Proxy0源码，会发现一下代码
         * public final class $Proxy0 extends Proxy implements Interface {
         *      public $Proxy0(InvocationHandler paramInvocationHandler) {
         *      super(paramInvocationHandler);
         * }
         * $Proxy0已经继承Proxy类，由于java的单继承特性，不能再继承其他类，所以只能靠实现被代理类（IOrderService）
         * 接口的方式。
         */
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        Order order = new Order(new Object(),1001);
        int result = orderService.saveOrder(order);
        System.out.println("执行结果：" + result);
    }
}
