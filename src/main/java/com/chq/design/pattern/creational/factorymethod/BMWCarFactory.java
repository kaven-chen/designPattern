package com.chq.design.pattern.creational.factorymethod;

public class BMWCarFactory extends CarFactory {
    @Override
    public Car produce() {
        return new BMWCar();
    }
}
