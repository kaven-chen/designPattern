package com.chq.design.pattern.creational.abstractfactory;

/**
 * 电器工厂
 */
public abstract class ElectricalApplianceFactory {

    /**
     * 生产冰箱
     * @return
     */
    public abstract Fridge getFridge();

    /**
     * 生产洗衣机
     * @return
     */
    public abstract WashingMachine getWashingMachine();
}
