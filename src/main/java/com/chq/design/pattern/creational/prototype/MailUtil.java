package com.chq.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * 邮件工具类
 * @Date 2019/12/5 22:52
 * @Created by ChenQiang
 */
public class MailUtil {
    public final static String template = "向{0}的邮箱{1}发送了内容：{2}";
    public final static String template2 = "向[%s]的邮箱[%s]发送了内容[%s]";

    public static void sendMail(Mail mail) {
        String format = String.format(template2, mail.getName(), mail.getEmailAddress(), mail.getContent());
        System.out.println(format);
//        System.out.println(MessageFormat.format(template, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginalMail(Mail mail) {
        System.out.println("保存原始邮件：" + mail.getContent());
    }
}
