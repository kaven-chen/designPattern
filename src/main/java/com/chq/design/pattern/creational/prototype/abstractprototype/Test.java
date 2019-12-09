package com.chq.design.pattern.creational.prototype.abstractprototype;

/**
 * 在实际的开发当中，直接让目标类实现Cloneable接口的方式用的比较多;
 * @Date 2019/12/9 21:42
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        // 克隆出不同对象
        B clone = (B) b.clone();
        System.out.println(b);
        System.out.println(clone);
    }
}
