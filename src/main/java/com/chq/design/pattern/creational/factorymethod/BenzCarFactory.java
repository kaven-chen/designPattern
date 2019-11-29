package com.chq.design.pattern.creational.factorymethod;

/**
 * 奔驰汽车工厂
 */
public class BenzCarFactory extends CarFactory{

    @Override
    public Car produce() {
        return new BenzCar();
    }
}
