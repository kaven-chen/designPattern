package com.chq.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂：关注产品族
 * 优点: 解耦程度高；
 *      在使用抽象工厂的时候，尽量找那种固定程度比较高的
 * 缺点：在新增产品等级的时候，会比较的麻烦;
 *      如果在现有的产品族里面添加新的产品等级，就违背了开闭原则了;
 *
 * 源码：
 * java.sql.Connection 接口中许多方法，都是抽象方法。
 * Statement PreparedStatement
 * MyBatis中的SqlSessionFactory:
 */
public class Test {
    public static void main(String[] args) {
        // 创建电器工厂
        ElectricalApplianceFactory factory = new HaierFactory();
        Fridge fridge = factory.getFridge();
        WashingMachine washingMachine = factory.getWashingMachine();
        fridge.work();
        washingMachine.work();

    }
}
