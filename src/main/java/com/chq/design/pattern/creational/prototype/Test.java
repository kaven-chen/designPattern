package com.chq.design.pattern.creational.prototype;

/**
 * 原型模式：
 *      优点
 *          比直接new一个对象性能高，简化创建过程
 *      缺点
 *          必须配备克隆方法（clone，即实现cloneable接口）
 *          必须掌握深拷贝，浅拷贝才能运用得当
 *          https://www.cnblogs.com/kexianting/p/8505056.html
 * @Date 2019/12/5 22:50
 * @Created by ChenQiang
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 5; i++) {
            // clone对象比直接new对象性能高，这里克隆出一个临时对象
            Mail tempMail = (Mail) mail.clone();
            tempMail.setName("标题" + i);
            tempMail.setEmailAddress("地址" + i);
            tempMail.setContent("你中奖了" + i);
            MailUtil.sendMail(tempMail);
        }

        // 这里原本是想保存初始化模板
        MailUtil.saveOriginalMail(mail);

    }

}
