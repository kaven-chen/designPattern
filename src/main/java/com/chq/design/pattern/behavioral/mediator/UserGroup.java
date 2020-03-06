package com.chq.design.pattern.behavioral.mediator;

/**
 * 用户群，扮演中介者
 *
 * @Date 2020/3/6 23:10
 * @Created by ChenQiang
 */
public class UserGroup {

    public static void showMessage(User user, String msg) {
        System.out.println("[" + user.getName() + "]:" + msg);
    }

}
