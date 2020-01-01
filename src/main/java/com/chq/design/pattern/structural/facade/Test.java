package com.chq.design.pattern.structural.facade;

import java.math.BigDecimal;

/**
 * 门面模式（也叫外观模式）
 *  提供统一的接口，用来访封装访问子系统的一群接口
 *
 * 外观模式源码：
 *  1.tomcat源码，后缀带facade的类
 *  2.jdbcUtils
 *
 * @Date 2019/12/9 23:38
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {

        ExchangeFacade exchangeFacade = new ExchangeFacade(new RepertoryService(),
                new PayService(), new ShippingService());
        exchangeFacade.exchange(new Goods("小米电视",new BigDecimal("10000")));
    }

}
