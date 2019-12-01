package com.chq.design.pattern.creational.builder;

/**
 * @Description 真正建造者
 * @Date 2019/12/1 13:12
 * @Created by Administrator
 */
public class CarActualBuilder extends CarBuilder{
    /**
     * 将car组合到实际建造者中
     */
    private Car car = new Car();

    @Override
    public void buildBrand(String brand) {
        car.setBrand(brand);
    }

    @Override
    public void buildColor(String color) {
        car.setColor(color);
    }

    @Override
    public void buildTyre(String tyre) {
        car.setTyre(tyre);
    }

    @Override
    public void buildLighting(String lighting) {
        car.setLighting(lighting);
    }

    @Override
    public Car makeCar() {
        return car;
    }
}
