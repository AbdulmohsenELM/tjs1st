package com.elm.tajsser.tajsser;

import javax.persistence.*;

@Entity
@Table
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "courseID")
    private int id;
    @Column(name = "courseName")
    private String name;

    public Course() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
