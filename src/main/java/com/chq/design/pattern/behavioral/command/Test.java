package com.chq.design.pattern.behavioral.command;

/**
 * 命令模式：
 *  定义：将请求封装成对象，以便使用不同的请求，
 *  命令模式解决了应用程序中对象的职责以及他们之间的通信方式
 *
 *  使用场景：
 *          请求调用者和请求接收者需要解耦，使得调用者和接收者不直接交互
 *
 *  源码解析：jdk junit
 *          Runnable接口可以理解成例子中的Command接口，run方法理解成Command.execute方法
 * @Date 2020/3/6 21:49
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) {
        Command command1 = new CodingCommand();
        Command command2 = new MakeReportCommand();

        Staff staff = new Staff("小明");
        staff.addCommand(command1);
        staff.addCommand(command2);

        staff.executeCommand();
    }
}
