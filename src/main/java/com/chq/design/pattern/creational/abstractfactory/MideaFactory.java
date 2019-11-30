package com.chq.design.pattern.creational.abstractfactory;

/**
 * 美的工厂：生产美的产品
 */
public class MideaFactory extends ElectricalApplianceFactory {


    @Override
    public Fridge getFridge() {
        return new MideaFridge();
    }

    @Override
    public WashingMachine getWashingMachine() {
        return new MideaWashingMachine();
    }
}
