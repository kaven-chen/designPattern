package com.chq.design.pattern.structural.facade;

/**
 * 库存服务
 * @Date 2020/1/1 9:25
 * @Created by ChenQiang
 */
public class RepertoryService {

    public void validateRepertory(Goods goods) {
        System.out.println("校验" + goods.getName() + "库存成功");
    }
}
