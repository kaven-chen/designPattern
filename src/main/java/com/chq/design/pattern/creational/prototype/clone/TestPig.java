package com.chq.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @Description
 * @Date 2019/12/9 22:01
 * @Created by ChenQiang
 */
public class TestPig {
    public static void main(String[]args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
