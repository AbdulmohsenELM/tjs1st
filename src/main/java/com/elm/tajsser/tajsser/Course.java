package com.elm.tajsser.tajsser;

import javax.persistence.*;

@Entity
@Table
public class Course {

    @Id
    @Column(name = "courseID")
    private int courseID;
    @Column(name = "courseName")
    private String courseName;

    public Course() {

    }
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int id) {
        this.courseID = id;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
