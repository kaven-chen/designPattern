package com.chq.design.pattern.behavioral.iterator;

/**
 * @Description
 * @Date 2020/3/2 22:03
 * @Created by ChenQiang
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
