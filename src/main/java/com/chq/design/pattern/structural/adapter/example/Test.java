package com.chq.design.pattern.structural.adapter.example;

/**
 * 举个例子，我们国家的民用电都是 220V，而我们的手机充电一般需要 5V，这时候要充电，
 * 就需要一个电压适配器，将 220V 输入电压变换为 5V 输出
 * @Date 2020/1/1 23:24
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5();
    }
}
