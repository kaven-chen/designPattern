package com.chq.design.pattern.structural.facade;

/**
 * @Description
 * @Date 2020/1/1 9:29
 * @Created by ChenQiang
 */
public class PayService {
    public void pay(Goods goods) {
        System.out.println("支付" + goods.getName() + "成功");
    }
}
