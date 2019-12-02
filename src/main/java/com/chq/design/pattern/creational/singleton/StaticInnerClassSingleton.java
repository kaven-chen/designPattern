package com.chq.design.pattern.creational.singleton;

/**
 * 静态内部类单例模式
 * 优点：
 *  1.延迟加载
 *  2.线程安全
 * @Date 2019/12/2 22:07
 * @Created by ChenQiang
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }
    /**
     * 声明为private
     * 静态内部类不会随着外部类的初始化而初始化，当被调用到getInstance方法的时候才会执行初始化
     * 从而保证了延迟加载，而jvm在class初始化的时候会给class加上初始化锁，从而也保证了多线程访问的情况下，
     * 只有一个线程能获取到class初始化锁，即使new对象时发生指令重排序也能保证线程安全，
     * */
    private static class Inner {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return Inner.staticInnerClassSingleton;
    }

}
