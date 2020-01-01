package com.chq.design.pattern.structural.facade;

/**
 * 物流服务
 *
 * @Date 2020/1/1 9:30
 * @Created by ChenQiang
 */
public class ShippingService {

    public void shipping(Goods goods) {
        System.out.println(goods.getName() + "已经发货");
    }

}
