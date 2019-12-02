package com.chq.design.pattern.creational.singleton;

/**
 * @Description
 * @Date 2019/12/2 21:24
 * @Created by ChenQiang
 */
public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(lazySingleton);
        /** 多线程debug */
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
    }
}
