package com.chq.design.pattern.structural.flyweight;

import java.util.Random;

/**
 * 享元模式：
 *  定义：提供了减少对象数量从而改善应用所需的对象结构方式
 *  应用场景：1.常用用于系统底层的开发，以便解决系统的性能问题
 *           2.系统有大量相似对象、需要缓冲池的场景
 *  优点：
 *      减少对象创建，降低内存消耗，提高效率
 *  缺点：
 *      关注内、外部状态，关注线程安全问题，使系统的程序逻辑变得复杂
 *
 */
public class Test {

    public final static String[] departments = {"QA", "RD", "PM", "BD"};

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = ManagerFactory.getManager(department);
            manager.report();

        }
    }
}
