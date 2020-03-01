package com.chq.design.pattern.structural.proxy;

/**
 * @Description
 * @Date 2020/3/1 20:32
 * @Created by ChenQiang
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("DAO层插入订单：" + order);
        return 0;
    }
}
