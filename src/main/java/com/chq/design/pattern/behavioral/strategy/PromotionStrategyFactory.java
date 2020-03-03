package com.chq.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 优化：结合工厂来-
 * 策略工厂
 * @Date 2020/3/3 7:43
 * @Created by ChenQiang
 */
public class PromotionStrategyFactory {

    private final static Map<String, PromotionStrategy> STRATEGY_MAP = new HashMap<>();
    private final static PromotionStrategy EMPTY_STRATEGY = new EmptyPromotionStrategy();
    static {
        STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
        STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    }

    public static PromotionStrategy getPromotionStrategy(String strategyKey) {
        PromotionStrategy promotionStrategy = STRATEGY_MAP.get(strategyKey);
        if (promotionStrategy == null) {
            return EMPTY_STRATEGY;
        }
        return promotionStrategy;
    }
    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }

}
