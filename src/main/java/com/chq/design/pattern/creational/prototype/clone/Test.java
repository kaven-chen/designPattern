package com.chq.design.pattern.creational.prototype.clone;

import sun.misc.Cleaner;

import java.util.Date;

/**
 * @Description
 * @Date 2019/12/9 21:46
 * @Created by ChenQiang
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee();
        emp1.setName("小明");
        emp1.setAge(18);
        emp1.setDept(new Dept("研发部"));

        Employee emp2 = (Employee) emp1.clone();
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());


        // 修改部门 浅拷贝的情况两个对象的部门都会变成测试部
        emp1.getDept().setName("测试部");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
