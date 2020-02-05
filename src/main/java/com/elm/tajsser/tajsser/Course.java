package com.elm.tajsser.tajsser;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Course {

    @Id
    @Column(name = "courseID")
    private int courseID;
    @Column(name = "courseName")
    private String courseName;

    @ManyToMany(mappedBy = "courses", cascade = { CascadeType.ALL })
    private Set<Student> students = new HashSet<Student>();

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
