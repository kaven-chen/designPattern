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
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
        // 枚举单例测试
        EnumInstance enumInstance = EnumInstance.getInstance();
        enumInstance.setData(new Object());
        // 调用枚举内的方法
        enumInstance.enumMethodTest();
        System.out.println(enumInstance.getData());

    }
}
