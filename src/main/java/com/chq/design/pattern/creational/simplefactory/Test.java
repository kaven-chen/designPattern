package com.chq.design.pattern.creational.simplefactory;

/**
 * 简单工厂
 *
 */
public class Test {

    public static void main(String[] args) {
        // 直接new出对象
        Car car1 = new BenzCar();
        car1.run();

        // 利用工厂创建
        CarFactory carFactory = new CarFactory();
        Car car2 = carFactory.getCar("bmw");
        car2.run();

        // 简单工厂反射
        Car car3 = carFactory.getCar(BMWCar.class);
        car3.run();
    }

}
