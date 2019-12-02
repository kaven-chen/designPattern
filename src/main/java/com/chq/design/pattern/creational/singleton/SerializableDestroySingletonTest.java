package com.chq.design.pattern.creational.singleton;

import java.io.*;

/**
 * 测试序列化破坏单例
 * @Date 2019/12/2 22:48
 * @Created by ChenQiang
 */
public class SerializableDestroySingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("singleton_file"));
        outputStream.writeObject(hungrySingleton);

        // 反序列化回来
        File file = new File("singleton_file");
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) inputStream.readObject();
        System.out.println(hungrySingleton);
        System.out.println(newInstance);
        System.out.println(hungrySingleton == newInstance);
    }
}
