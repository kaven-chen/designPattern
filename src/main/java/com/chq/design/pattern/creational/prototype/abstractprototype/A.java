package com.chq.design.pattern.creational.prototype.abstractprototype;

/**
 * 通过抽象类来实现原型模式
 *
 * @Date 2019/12/9 21:41
 * @Created by ChenQiang
 */
public class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
