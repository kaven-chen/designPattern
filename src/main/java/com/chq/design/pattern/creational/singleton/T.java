package com.chq.design.pattern.creational.singleton;

/**
 * @Description
 * @Date 2019/12/2 21:44
 * @Created by ChenQiang
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton singleton = LazySingleton.getInstance();
//        StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(singleton);
    }
}
