package com.chq.design.pattern.creational.abstractfactory;

/**
 * 海尔工厂
 */
public class HaierFactory extends ElectricalApplianceFactory {
    @Override
    public Fridge getFridge() {
        return new HaierFridge();
    }

    @Override
    public WashingMachine getWashingMachine() {
        return new HaierWashingMachine();
    }
}
