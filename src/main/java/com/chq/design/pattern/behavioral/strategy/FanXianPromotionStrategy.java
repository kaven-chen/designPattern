package com.chq.design.pattern.behavioral.strategy;

/**
 * @Description
 * @Date 2020/3/3 7:20
 * @Created by ChenQiang
 */
public class FanXianPromotionStrategy extends PromotionStrategy {
    @Override
    void promotion() {
        System.out.println("返现20元");
    }
}
