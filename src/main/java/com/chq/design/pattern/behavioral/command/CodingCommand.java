package com.chq.design.pattern.behavioral.command;

/**
 * @Description
 * @Date 2020/3/6 22:07
 * @Created by ChenQiang
 */
public class CodingCommand implements Command {
    @Override
    public void execute() {
        System.out.println("写代码指令！");
    }
}
