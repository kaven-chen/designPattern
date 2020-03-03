package com.chq.design.pattern.behavioral.strategy;

/**
 * 策略模式
 *      定义：
 *          定义了算法家族，分别封装起来，让它们之间可以相互转换，此模式让算法的变化不会影响到使用算法的用户
 *      使用场景：
 *          1.系统中有很多类，而他们的区别在于他们的行为不同
 *          2.一个系统需要动态的在几种算法中选择一种 if...else...
 *      优点：
 *          避免使用多重条件转移语句
 *          提高算法的保密性和安全性
 *
 *      缺点：客户端必须知道所有的策略类，并自行决定使用哪一个策略类
 * @Date 2020/3/3 7:17
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {

        // ------------------------v1------------------
        /** 在618的时候，我们使用立减的策略 */
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        /** 在11.11时候，我们使用返现的策略 */
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
        promotionActivity618.executePromotion();
        promotionActivity1111.executePromotion();
        // ------------------------v2------------------
        // 在v1版本中，每次指定策略时候都要自己new出来，这里采用结合工厂模式的方式来优化代码
        String strategyKey = "LIJIAN";
        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(strategyKey));
        activity.executePromotion();
    }
}
