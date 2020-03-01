package com.chq.design.pattern.structural.proxy;

/**
 * @Description
 * @Date 2020/3/1 20:30
 * @Created by ChenQiang
 */
public class Order {

    private Object orderInfo;
    private Integer userId;

    public Order() {
    }

    public Order(Object orderInfo, Integer userId) {
        this.orderInfo = orderInfo;
        this.userId = userId;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderInfo=" + orderInfo +
                ", userId=" + userId +
                '}';
    }
}
