package com.chq.design.pattern.creational.singleton;

/**
 * @Description 懒汉单例模式
 * @Date 2019/12/2 21:21
 * @Created by ChenQiang
 */
public class LazySingleton {

    private static LazySingleton instance;
    // 构造器私有化
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        /** 这个是有线程安全的问题 当两个线程同时进入这个判断时*/
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
