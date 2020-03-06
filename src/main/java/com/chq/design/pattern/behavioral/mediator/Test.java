package com.chq.design.pattern.behavioral.mediator;

/**
 * 中介者模式：定义一个封装一组对象如何交易的对象
 *  通过使对象明确的相互引用来促进对象的松散耦合，并允许独立的改变他们的交互
 * 使用场景：
 *  系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解
 *  交互的公共行为，如果需要改变行为则可以增加新的中介者类
 *
 * 优点：
 *  将一对多转化成了一对一，降低程序复杂性
 *
 * 源码解析：java.util.Timer
 *
 * @Date 2020/3/6 23:02
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User("小明");
        User user2 = new User("小红");

        user1.sendMsg("小红，我喜欢你");
        user2.sendMsg("你是什么品种的癞蛤蟆？");
    }
}
