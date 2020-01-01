package com.chq.design.pattern.structural.facade;

import java.math.BigDecimal;

/**
 * 商品
 * @Date 2020/1/1 9:28
 * @Created by ChenQiang
 */
public class Goods {

    private String name;
    private BigDecimal price;

    public Goods() {
    }

    public Goods(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
