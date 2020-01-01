package com.chq.design.pattern.structural.decorator.v1;

/**
 * @Description 加蛋煎饼 extends 煎饼
 * @Date 2020/1/1 12:49
 * @Created by ChenQiang
 */
public class BattercakeWithEgg extends Battercake{
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
