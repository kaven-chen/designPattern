package com.chq.design.pattern.structural.bridge;

/**
 * 银行
 * @Date 2020/2/27 23:17
 * @Created by ChenQiang
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    /**
     * 打开账户
     * @return
     */
    public abstract Account openAccount();

}
