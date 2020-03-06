package com.chq.design.pattern.behavioral.mediator;

/**
 * @Description
 * @Date 2020/3/6 23:10
 * @Created by ChenQiang
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMsg(String msg) {
        UserGroup.showMessage(this,msg);
    }
}
