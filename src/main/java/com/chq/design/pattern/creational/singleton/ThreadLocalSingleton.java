package com.chq.design.pattern.creational.singleton;

/**
 * ThreadLocal“单例”模式： 这个单例并非真正意义的单例，这个单例只保证同一个线程获取到的是同一个实例
 *
 * 同步锁和threadLocal区别
 *  同步锁是以时间换空间，线程之间等待耗时换取实例数量的减少
 *  threadLocal是以空间换时间，为每个线程创建专属的实例，且线程隔离
 * @Date 2019/12/3 22:46
 * @Created by ChenQiang
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }

}
