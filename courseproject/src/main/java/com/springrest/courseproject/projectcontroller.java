package com.springrest.courseproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projectcontroller {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> getcourses(){
        return this.courseService.getcourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getcourse(@PathVariable String courseId){
        return this.courseService.getCourse(courseId);
    }
    @PostMapping("/courses")
    public Course addcourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
    @PutMapping("/courses")
    public Course updatecourse(@RequestBody Course course){
        this.courseService.updatCourse(course);
        return course;
    }
    @DeleteMapping("/courses/{courseId}")
public Course deleteCourse(@PathVariable String courseId) {
    return this.courseService.deleteCourse(courseId);
}


}
