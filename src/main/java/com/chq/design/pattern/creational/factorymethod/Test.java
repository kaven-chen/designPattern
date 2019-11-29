package com.chq.design.pattern.creational.factorymethod;

/**
 * 工厂方法：关注产品等级
 * 产品等级：比如汽车，宝马汽车和奔驰汽车是同一个产品等级
 *
 * 举例：
 *  jdk源码
 *  
 *
 */
public class Test {

    public static void main(String[] args) {
        CarFactory carFactory = new BenzCarFactory();
        Car car = carFactory.produce();

        car.run();
    }

}
