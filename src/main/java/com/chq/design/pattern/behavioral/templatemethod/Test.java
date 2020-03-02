package com.chq.design.pattern.behavioral.templatemethod;

/**
 * 模板方法
 */
public class Test {

    public static void main(String[] args) {
        ACourse designPatternCourse = new DesignPatternCourse(true);
        designPatternCourse.makeCourse();
        System.out.println("---------------------------------");
        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
    }

}
