package com.chq.design.pattern.structural.decorator.v2;

/**
 * @Description
 * @Date 2020/1/1 13:14
 * @Created by ChenQiang
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根火腿";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
