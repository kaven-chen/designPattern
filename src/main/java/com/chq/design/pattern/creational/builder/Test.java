package com.chq.design.pattern.creational.builder;

/**
 * 建造者模式：
 *
 * @Description
 * @Date 2019/12/1 13:17
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {
        Designer designer = new Designer();
        CarBuilder carBuilder = new CarActualBuilder();
        designer.setCarBuilder(carBuilder);
        Car car = designer.makeCar("宝马", "绿色", "宝马轮胎", "宝马车灯");
        System.out.println(car);
    }
}
