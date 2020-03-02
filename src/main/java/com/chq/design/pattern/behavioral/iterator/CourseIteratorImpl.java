package com.chq.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @Description
 * @Date 2020/3/2 22:03
 * @Created by ChenQiang
 */
public class CourseIteratorImpl implements CourseIterator {
    private List courseList;
    private int position;
    private Course course;
    public CourseIteratorImpl(List courseList){
        this.courseList=courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程,位置是: "+position);
        course=(Course)courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse(){
        if(position< courseList.size()){
            return false;
        }
        return true;
    }
}
