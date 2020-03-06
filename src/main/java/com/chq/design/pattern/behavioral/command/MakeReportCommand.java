package com.chq.design.pattern.behavioral.command;

/**
 * @Description
 * @Date 2020/3/6 22:08
 * @Created by ChenQiang
 */
public class MakeReportCommand implements Command {
    @Override
    public void execute() {
        System.out.println("制作报表！");
    }
}
