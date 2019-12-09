package com.chq.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @Description
 * @Date 2019/12/9 21:45
 * @Created by ChenQiang
 */
public class Employee implements Cloneable {
    private String name;
    private Integer age;
    private Dept dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Employee employee = (Employee) super.clone();
        employee.dept = (Dept) employee.dept.clone();
        return employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                '}' + super.toString();
    }
}
