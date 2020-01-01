package com.chq.design.pattern.structural.adapter.example;

/**
 * 5v直流电适配器
 * @Date 2020/1/1 23:36
 * @Created by ChenQiang
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5() {
        // 变压器。。。
        int ouput = ac220.ouputAC220() / 44;
        System.out.println("通过电源适配器，将输入AC:"+ac220.ouputAC220() + "v,输出DC:"+ouput+"v");
        return ouput;
    }
}
