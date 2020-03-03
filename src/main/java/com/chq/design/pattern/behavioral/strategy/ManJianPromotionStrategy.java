package com.chq.design.pattern.behavioral.strategy;

/**
 * @Description
 * @Date 2020/3/3 7:22
 * @Created by ChenQiang
 */
public class ManJianPromotionStrategy extends PromotionStrategy {

    @Override
    void promotion() {
        System.out.println("满200减20");
    }
}
