package com.chq.design.pattern.structural.adapter.objectadapter;

/**
 * @Description 在继承和组合的时候，我们优先使用组合
 * @Date 2020/1/1 23:20
 * @Created by ChenQiang
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.reqeust();
    }
}
