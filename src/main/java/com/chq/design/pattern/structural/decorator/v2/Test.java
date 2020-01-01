package com.chq.design.pattern.structural.decorator.v2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 装饰者模式
 * @Date 2020/1/1 11:51
 * @Created by ChenQiang
 */
public class Test {

    public static void main(String[] args) {
        // 实现v1版遗留的需求
        // 假如顾客顾客需要加3个鸡蛋，2个火腿，使用这种方式得继承很多次
        AbstractBattercake battercake;
        battercake = new EggDecorator(new Battercake());
//        battercake = new EggDecorator(battercake);
//        battercake = new EggDecorator(battercake);
//        battercake = new SausageDecorator(battercake);
//        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getDesc() + " 价格：" + battercake.getPrice());
    }
}
