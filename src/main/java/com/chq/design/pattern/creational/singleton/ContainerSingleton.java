package com.chq.design.pattern.creational.singleton;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例模式：适用与多个单例，用容器将多个单例装起来，如map
 *
 * @Date 2019/12/3 22:35
 * @Created by ChenQiang
 */
public class ContainerSingleton {

    // 使用hashMap不能保证线程安全,使用HashTable可以保证线程安全，但是降低了性能
    private static Map<String, Object> singletonMap = new HashMap<>();
    // 私有化构造器
    private ContainerSingleton() {
    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}
