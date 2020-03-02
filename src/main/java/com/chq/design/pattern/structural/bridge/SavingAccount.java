package com.chq.design.pattern.structural.bridge;

/**
 * @Description
 * @Date 2020/2/27 23:15
 * @Created by ChenQiang
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账户");
    }
}
