package com.chq.design.pattern.structural.decorator.v1;

/**
 * 煎饼加鸡蛋加火腿
 * @Date 2020/1/1 12:52
 * @Created by ChenQiang
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个火腿";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
