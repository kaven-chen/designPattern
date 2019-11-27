package com.chq.design.pattern.creational.simplefactory;

/**
 * 宝马汽车
 */
public class BMWCar extends Car {
    @Override
    public void produce() {
        System.out.println("生产宝马汽车");
    }
}
