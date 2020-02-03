package com.elm.tajsser.tajsser;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Student {

    @Id
    @Column(name = "StudentID")
    private int studentID;
    @Column(name = "StudentName")
    private String studentName;
    @Column(name = "StudentAge")
    private int studentAge;

    @OneToOne(targetEntity = Role.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "RoleID", referencedColumnName = "RoleID")
    private Role role;

    public Student() {

    }
    public Student(int studentID, String studentName, int studentAge) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}
