package com.chq.design.pattern.creational.simplefactory;

/**
 * 简单共产
 */
public class CarFactory {
    /**
     * 方式一
     * 缺点：增加新的car时需要修改代码
     *
     * @param type
     * @return
     */
    public Car getCar(String type) {
        if ("bmw".equalsIgnoreCase(type)) {
            return new BMWCar();
        }
        if ("benz".equalsIgnoreCase(type)) {
            return new BenzCar();
        }
        return null;
    }

    /**
     * 方式二
     * 利用发射创建对象，新增car时可以不用修改方法
     * @param c
     * @return
     */
    public Car getCar(Class c) {
        try {
            Car car = (Car) Class.forName(c.getName()).newInstance();
            return car;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
