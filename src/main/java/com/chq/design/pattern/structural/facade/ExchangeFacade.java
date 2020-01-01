package com.chq.design.pattern.structural.facade;

import com.chq.design.principle.dependenceinversion.PythonCourse;

/**
 * 门面
 *
 * @Date 2020/1/1 9:32
 * @Created by ChenQiang
 */
public class ExchangeFacade {

    private RepertoryService repertoryService;
    private PayService payService;
    private ShippingService shippingService;

    public ExchangeFacade() {
    }

    public ExchangeFacade(RepertoryService repertoryService, PayService payService, ShippingService shippingService) {
        this.repertoryService = repertoryService;
        this.payService = payService;
        this.shippingService = shippingService;
    }

    public void exchange(Goods goods) {
        repertoryService.validateRepertory(goods);
        payService.pay(goods);
        shippingService.shipping(goods);
    }

}
