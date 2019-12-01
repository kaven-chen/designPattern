package com.chq.design.pattern.creational.builder.v2;

/**
 * @Description
 * @Date 2019/12/1 13:41
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder().buildBrand("奔驰")
                .buildColor("黑色")
                .buildTyre("奔驰轮胎")
                .buildLighting("奔驰车灯")
                .build();
        System.out.println(car);
    }
}
