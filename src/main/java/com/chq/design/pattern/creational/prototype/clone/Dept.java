package com.chq.design.pattern.creational.prototype.clone;

/**
 * @Description
 * @Date 2019/12/9 21:52
 * @Created by ChenQiang
 */
public class Dept implements Cloneable {
    private String name;

    public Dept(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
