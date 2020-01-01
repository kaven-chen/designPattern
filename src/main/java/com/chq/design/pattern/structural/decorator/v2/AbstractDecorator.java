package com.chq.design.pattern.structural.decorator.v2;

/**
 * @Description 抽象装饰者
 * @Date 2020/1/1 13:00
 * @Created by ChenQiang
 */
public class AbstractDecorator extends AbstractBattercake {

    private AbstractBattercake abstractBattercake;

    public AbstractDecorator(AbstractBattercake abstractBattercake) {
        this.abstractBattercake = abstractBattercake;
    }

    @Override
    protected String getDesc() {
        return abstractBattercake.getDesc();
    }

    @Override
    protected int getPrice() {
        return abstractBattercake.getPrice();
    }
}
