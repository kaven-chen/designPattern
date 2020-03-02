package com.chq.design.pattern.structural.proxy.cglibproxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description
 * @Date 2020/3/1 22:39
 * @Created by ChenQiang
 */
public class CgLibOrderServiceDynamicProxy implements MethodInterceptor {

    // 目标类
    private Object target;

    public Object newInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer(); //  /ɪnˈhɑːnsə(r)/ n. [遗] 增强子；强化剂；增加者
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        Object proxy = enhancer.create();
        return proxy; // 返回代理对象
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        beforeMethod();
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }

    public void beforeMethod() {
        System.out.println("cglib动态代理:beforeMethod");
    }

    public void afterMethod() {
        System.out.println("cglib动态代理：afterMethod");
    }
}
