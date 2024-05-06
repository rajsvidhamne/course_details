package com.springrest.courseproject;

import java.util.List;

public interface CourseService {
    public List<Course> getcourses();
    public Course getCourse(String courseId);
    public Course addCourse(Course course);
    public Course updatCourse(Course course);
    public Course deleteCourse(String courseId);
}

