package com.chq.design.pattern.behavioral.iterator;

/**
 * @Description
 * @Date 2020/3/2 22:02
 * @Created by ChenQiang
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);
    /**获取迭代器 */
    CourseIterator getCourseIterator();
}
