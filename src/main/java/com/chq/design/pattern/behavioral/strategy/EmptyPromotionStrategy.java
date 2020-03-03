package com.chq.design.pattern.behavioral.strategy;

/**
 * @Description
 * @Date 2020/3/3 7:53
 * @Created by ChenQiang
 */
public class EmptyPromotionStrategy extends PromotionStrategy {
    @Override
    void promotion() {
        System.out.println("没有促销策略");
    }
}
