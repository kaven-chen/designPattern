package com.chq.design.pattern.creational.builder.v2;

/**
 *
 * @Description 改进版本，使用静态内部类，使用链式调用
 * @Date 2019/12/1 13:32
 * @Created by ChenQiang
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

    public Car(CarBuilder carBuilder) {
        this.brand = carBuilder.brand;
        this.color = carBuilder.color;
        this.tyre = carBuilder.tyre;
        this.lighting = carBuilder.lighting;
    }

    public static class CarBuilder {
        private String brand;
        private String color;
        private String tyre;
        private String lighting;

        public CarBuilder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder buildColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder buildTyre(String tyre) {
            this.tyre = tyre;
            return this;
        }

        public CarBuilder buildLighting(String lighting) {
            this.lighting = lighting;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
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
