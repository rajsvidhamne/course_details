package com.springrest.courseproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="courses_info")
public class Course {
    @Id
private int courseid;
private String coursename;
private String courseinstructorname;
private String coursedescription;
private double coursefees;
public Course() {
}
public Course(int courseid, String coursename, String courseinstructorname, String coursedescription,
        double coursefees) {
    this.courseid = courseid;
    this.coursename = coursename;
    this.courseinstructorname = courseinstructorname;
    this.coursedescription = coursedescription;
    this.coursefees = coursefees;
}
public int getCourseid() {
    return courseid;
}
public void setCourseid(int courseid) {
    this.courseid = courseid;
}
public String getCoursename() {
    return coursename;
}
public void setCoursename(String coursename) {
    this.coursename = coursename;
}
public String getCourseinstructorname() {
    return courseinstructorname;
}
public void setCourseinstructorname(String courseinstructorname) {
    this.courseinstructorname = courseinstructorname;
}
public String getCoursedescription() {
    return coursedescription;
}
public void setCoursedescription(String coursedescription) {
    this.coursedescription = coursedescription;
}
public double getCoursefees() {
    return coursefees;
}
public void setCoursefees(double coursefees) {
    this.coursefees = coursefees;
}

// Now Generate empty and parameterized constructors


}
