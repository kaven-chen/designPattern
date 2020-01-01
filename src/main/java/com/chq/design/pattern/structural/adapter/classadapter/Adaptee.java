package com.chq.design.pattern.structural.adapter.classadapter;

/**
 * @Description 已存在将要被适配的对象
 * @Date 2020/1/1 23:09
 * @Created by ChenQiang
 */
public class Adaptee {

    public void adapterRequest() {
        System.out.println("被适配者的方法");
    }

}
