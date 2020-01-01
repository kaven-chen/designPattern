package com.chq.design.pattern.structural.decorator.v1;

/**
 * 使用继承的方式来制作煎饼，这样非常的不灵活
 * 假如顾客顾客需要加3个鸡蛋，2个火腿，使用这种方式得继承很多次
 * 改进版：
 *      v2版中使用装饰者模式来实现
 * @Date 2020/1/1 11:51
 * @Created by ChenQiang
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "价格：" + battercake.getPrice());
        battercake = new BattercakeWithEgg();
        System.out.println(battercake.getDesc() + "价格：" + battercake.getPrice());
        battercake = new BattercakeWithEggSausage();
        System.out.println(battercake.getDesc() + "价格：" + battercake.getPrice());
    }
}
