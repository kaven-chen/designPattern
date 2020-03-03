package com.chq.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Date 2020/3/2 22:02
 * @Created by ChenQiang
 */
public class CourseAggregateImpl implements CourseAggregate {
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
