package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {

        list = new ArrayList<>();
        list.add(new Course(145, "Java Core Course", "this course contains basics of java"));
        list.add(new Course(1456, "Java Spring boot Course", "this course contains basics of spring boot"));

    }

    //Get all courses
    @Override
    public List<Course> getCourses() {
        return list;
    }

    //Get course by course id
    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for (Course course:list) {
            if(course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    //Add course
    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }


}
