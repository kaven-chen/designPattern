package com.chq.design.pattern.structural.adapter.objectadapter;

/**
 * @Description 将继承的方式改成组合
 * @Date 2020/1/1 23:13
 * @Created by ChenQiang
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void reqeust() {
        // do something...
        adaptee.adapterRequest();
    }
}
