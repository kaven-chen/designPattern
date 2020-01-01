package com.chq.design.pattern.structural.decorator.v2;

/**
 * @Description 煎饼类 被装饰的对象
 * @Date 2020/1/1 12:58
 * @Created by ChenQiang
 */
public class Battercake extends AbstractBattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 8;
    }
}
