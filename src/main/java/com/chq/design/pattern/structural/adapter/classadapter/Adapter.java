package com.chq.design.pattern.structural.adapter.classadapter;

/**
 * @Description
 * @Date 2020/1/1 23:13
 * @Created by ChenQiang
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void reqeust() {
        // do something...
        super.adapterRequest();
    }
}
