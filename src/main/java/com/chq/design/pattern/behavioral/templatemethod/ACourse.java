package com.chq.design.pattern.behavioral.templatemethod;

/**
 * 抽象课程类
 */
public abstract class ACourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    /**
     * 模板方法定义是不允许子类修改的，需要加final修饰
     */
    final protected void makePPT() {
        System.out.println("制作ppt");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    /** 这个编写手记是一个可选项 */
    final void writeArticle() {
        System.out.println("编写手记");
    }

    /** 我们就要给这个编写手记声明一个勾子方法 */
    /** 这个并不是一个final方法，子类是可以进行覆盖的 */
    protected boolean needWriteArticle() {
        return false;
    }

    // 打包课程，有子类实现
    abstract void packageCourse();

}
