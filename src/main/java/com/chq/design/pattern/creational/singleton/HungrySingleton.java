package com.chq.design.pattern.creational.singleton;

/**
 * 饿汉模式
 * @Date 2019/12/2 22:32
 * @Created by ChenQiang
 */
public class HungrySingleton {
    /**
     * 在类加载的时候，就完成了实例化，避免了线程同步的问题，缺点就是在类加载的时候，就完成了初始化，
     * 没有延迟加载，这个时候，就是会造成内存的浪费
     */
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    // 或者用静态块初始化
//    private static HungrySingleton hungrySingleton = null;
//    static {
//        hungrySingleton = new HungrySingleton();
//    }

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}

