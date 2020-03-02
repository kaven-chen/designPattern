package com.chq.design.pattern.structural.proxy;

/**
 * @Description
 * @Date 2020/3/1 20:35
 * @Created by ChenQiang
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        System.out.println("service层：保存订单");
        iOrderDao = new OrderDaoImpl();
        return iOrderDao.insert(order);
    }
}
