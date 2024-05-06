package com.springrest.courseproject;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImplementation implements CourseService {

    @Autowired
    private CourseRepo repo;

    @Override
    public List<Course> getcourses() {
        return repo.findAll();
    }

    @Override
    public Course getCourse(String courseId) {
        return repo.getOne(Integer.parseInt(courseId));
    }

    @Override
    public Course addCourse(Course course) {
        return repo.save(course);
    }

    // @Override
    // public Course updateCourse(Course course) {
    //     repo.save(course);
    //     return course;
    // }

    @Override
    public Course deleteCourse(String courseId) {
        Course courseToDelete = repo.getOne(Integer.parseInt(courseId));
        repo.delete(courseToDelete);
        return courseToDelete;
    }

    @Override
    public Course updatCourse(Course course) {
        repo.save(course);
        return course;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updatCourse'");
    }
}
