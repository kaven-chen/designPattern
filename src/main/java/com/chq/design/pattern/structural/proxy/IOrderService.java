package com.chq.design.pattern.structural.proxy;

/**
 * @Description
 * @Date 2020/3/1 20:34
 * @Created by ChenQiang
 */
public interface IOrderService {
    /**
     * 保存订单
     * @param order
     * @return
     */
    int saveOrder(Order order);

}
