package com.chq.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉模式
 * @Date 2019/12/2 22:32
 * @Created by ChenQiang
 */
public class HungrySingleton implements Serializable { // 实现序列化接口，测试序列化破坏单例
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
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /** 我们加上这样的一个方法,防止序列化破坏单例 */
    private Object readResolve() {
        return hungrySingleton;
    }

}

