package com.chq.design.pattern.creational.builder.v2;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableSet;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

import java.util.Set;

/**
 * jdk源码 StringBuilder StringBuffer
 * guava: cacheBuilder ImmutableSet
 * spring: BeanDefinitionBuilder
 * mybatis: SqlSessionFactoryBuilder XMLConfigBuilder
 * @Description
 * @Date 2019/12/1 13:41
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder().buildBrand("奔驰")
                .buildColor("黑色")
                .buildTyre("奔驰轮胎")
                .buildLighting("奔驰车灯")
                .build();
        System.out.println(car);

        // guava 建造者模式测试
        Set set = ImmutableSet.builder().add("a").add("b").build();
        System.out.println(set);
        Cache<Object, Object> build = CacheBuilder.newBuilder()
                        .maximumSize(100).build();
        test(Car.class);

    }


    public static void test(Class<?> clazz) {
        System.out.println(clazz.getName());
    }
}
