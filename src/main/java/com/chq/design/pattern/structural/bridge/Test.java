package com.chq.design.pattern.structural.bridge;

import com.chq.design.pattern.creational.prototype.abstractprototype.A;

/**
 * 桥接模式：
 *  定义：将抽象部分与具体实现部分分离，使他们可以独立变化
 *  通过组合的方式将两个类建立联系，而不是继承
 *  桥接模式重要的就是把抽象和实现分离出来，然后中间通过组合来搭建他们之间的桥梁：
 *
 *  使用场景：
 *      抽象和具体实现之间增加更多的灵活性
 *      一个类存在两个或多个独立的维度，且这两个或多个维度都需要独立进行扩展时
 *  优点：
 *      分离抽象和具体实现部分、提高系统扩展性，符合开闭原则，符合合成复用原则
 *  缺点：
 *      增加系统的设计与理解难度
 *      需要正确的识别出系统中独立变化的维度
 *
 *  代码场景：
 *      中国有很多银行，有中国农业银行和中国工商银行；银行账号又有定期账号和活期账号，
 *      现将账号和银行作为两个可以独立变化的维度来实现桥接模式
 *  源码解析：
 *      jdbc里面的 Driver:
 * @Date 2020/2/27 21:43
 * @Created by ChenQiang
 */
public class Test {

    public static void main(String[] args) {

        Bank abcBank = new ABCBank(new DepositAccount());
        Account abcBankAccount = abcBank.openAccount();
        abcBankAccount.showAccountType();

        Bank icbcBank = new ICBCBank(new SavingAccount());
        Account icbcBankAccount = icbcBank.openAccount();
        icbcBankAccount.showAccountType();

    }

}
