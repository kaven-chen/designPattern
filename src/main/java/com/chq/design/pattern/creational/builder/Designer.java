package com.chq.design.pattern.creational.builder;

/**
 * @Description 汽车设计师
 * @Date 2019/12/1 13:19
 * @Created by ChenQiang
 */
public class Designer {

    private CarBuilder carBuilder;

    /** 这里的CourseBuilder通过set的方式给注入进来 */
    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car makeCar(String brand, String color, String tyre, String lighting) {
        this.carBuilder.buildBrand(brand);
        this.carBuilder.buildColor(color);
        this.carBuilder.buildTyre(tyre);
        this.carBuilder.buildLighting(lighting);
        return this.carBuilder.makeCar();
    }

}
