package com.chq.design.pattern.structural.decorator.v2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 装饰者模式
 *  继承是达到扩展功能的方法之一，但并不总是最优选择
 *  装饰者和被装饰者应该有共同的父类
 *  被装饰者可以被大量的装饰者所装饰
 *  装饰者模式具有运行时行为
 *  很好的体现了开闭原则：对扩展开放，对修改关闭
 * @Date 2020/1/1 11:51
 * @Created by ChenQiang
 */
public class Test {

    public static void main(String[] args) throws Exception {
        // 实现v1版遗留的需求
        // 假如顾客顾客需要加3个鸡蛋，2个火腿，使用这种方式得继承很多次
        AbstractBattercake battercake;
        battercake = new EggDecorator(new Battercake());
//        battercake = new EggDecorator(battercake);
//        battercake = new EggDecorator(battercake);
//        battercake = new SausageDecorator(battercake);
//        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getDesc() + " 价格：" + battercake.getPrice());

        /*
         * jdk io流装饰者模式举例：
         * 这里的FileInputStream就是一个具体的被装饰者
         * BufferedInputStream就是一个装饰者，从构造对象的过程可以清晰的看出来；
         * 它继承自FilterInputStream，所以FilterInputStream就是所有装饰者共同的父类，它也是InputStream的子类
         * */
        InputStream inputStream = new FileInputStream(new File("G:\\workspace\\localGithubProjects\\designPattern\\src\\main\\resources\\test.txt"));
        BufferedInputStream bufIns = new BufferedInputStream(inputStream);

        byte[] bytes = new byte[1024];
        int len = bufIns.read(bytes);
        while (len != -1) {
            System.out.println(new String(bytes));
            len = bufIns.read();
        }

    }
}
