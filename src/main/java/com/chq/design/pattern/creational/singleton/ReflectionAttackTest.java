package com.chq.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射攻击测试
 * 防止反射攻击：在构造器中加入判空代码
 *
 * @Date 2019/12/2 23:13
 * @Created by ChenQiang
 */
public class ReflectionAttackTest {

    public static void main(String[] args) throws Exception {
        Class cls = HungrySingleton.class;
        Constructor constructor = cls.getDeclaredConstructor();
        // 设置为true，否则会报错 java.lang.IllegalAccessException
        constructor.setAccessible(true);
        HungrySingleton instance1 = HungrySingleton.getInstance();
        // 私有构造器可以使用反射绕开不能new的限制
        HungrySingleton instance2 = (HungrySingleton) constructor.newInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }

}
