package com.chq.design.pattern.structural.decorator.v2;

/**
 * @Description
 * @Date 2020/1/1 13:02
 * @Created by ChenQiang
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

    @Override
    protected String getDesc() {
        // 这里有点类似递归
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }


}
