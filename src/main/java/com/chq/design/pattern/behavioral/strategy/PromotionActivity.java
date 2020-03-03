package com.chq.design.pattern.behavioral.strategy;

/**
 * 促销活动
 *
 * @Created by ChenQiang
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotion() {
        promotionStrategy.promotion();
    }
}
