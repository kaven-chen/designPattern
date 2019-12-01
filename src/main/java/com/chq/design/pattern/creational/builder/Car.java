package com.chq.design.pattern.creational.builder;

/**
 * @Description 汽车类
 * @Date 2019/12/1 11:55
 * @Created by Administrator
 */
public class Car {

    // 品牌
    private String brand;
    // 颜色
    private String color;
    // 轮胎
    private String tyre;
    // 车灯
    private String lighting;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", tyre='" + tyre + '\'' +
                ", lighting='" + lighting + '\'' +
                '}';
    }
}
