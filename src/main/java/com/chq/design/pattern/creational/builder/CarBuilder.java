package com.chq.design.pattern.creational.builder;

/**
 * @Description
 * @Date 2019/12/1 13:10
 * @Created by Administrator
 */
public abstract class CarBuilder {
    public abstract void buildBrand(String brand);
    public abstract void buildColor(String color);
    public abstract void buildTyre(String tyre);
    public abstract void buildLighting(String lighting);

    public abstract Car makeCar();
}
