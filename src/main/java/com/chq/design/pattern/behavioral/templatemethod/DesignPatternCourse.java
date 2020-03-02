package com.chq.design.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {

    // 定义一个属性,将是否写手机开放给客户端决定
    private boolean needWriteArticle = false;

    public DesignPatternCourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("打包课程源码");
    }

    // 如果需要手机，则覆盖钩子方法
    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticle;
    }
}
