package com.chq.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工
 * @Date 2020/3/6 22:08
 * @Created by ChenQiang
 */
public class Staff {
    private String name;
    // 命令
    private List<Command> list = new ArrayList<Command>();

    public Staff(String name) {
        this.name = name;
    }

    public void addCommand(Command command) {
        list.add(command);
    }

    public void executeCommand() {
        for (Command command : list) {
            System.out.print("员工"+name +"执行命令：");
            command.execute();
        }
        // 清空命令
        list.clear();
    }
}
