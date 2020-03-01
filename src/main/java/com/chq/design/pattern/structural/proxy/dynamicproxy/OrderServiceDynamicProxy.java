package com.chq.design.pattern.structural.proxy.dynamicproxy;

import com.chq.design.pattern.structural.proxy.IOrderService;
import com.chq.design.pattern.structural.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @Date 2020/3/1 21:16
 * @Created by ChenQiang
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    // 目标类，用Object声明，可以代理各种接口。
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    // 核心方法，生成代理对象
    public Object bind() {
        Class cls = target.getClass();
        Object proxyInstance = Proxy.newProxyInstance(cls.getClassLoader(),
                cls.getInterfaces(), this);
        return proxyInstance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(args[0]);
        // 调用目标方法
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }

    public void beforeMethod(Object object) {
        System.out.println("动态代理： beforeMethod obj:" + object.toString());
    }

    public void afterMethod() {
        System.out.println("动态代理： afterMethod");
    }

}
