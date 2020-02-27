package com.chq.design.pattern.structural.bridge;

/**
 * 工商银行账户
 * @Date 2020/2/27 23:21
 * @Created by ChenQiang
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开工商银行账户");
        account.openAccount(); // 这行代码要加上，将openAccount这个动作委托给账户类
        return account;
    }
}
