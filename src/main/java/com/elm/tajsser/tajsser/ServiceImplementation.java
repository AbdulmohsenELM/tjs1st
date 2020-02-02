package com.elm.tajsser.tajsser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service

public class ServiceImplementation implements Service {

    @Autowired
    private StudentREPO repo;

    @Override
    public Student addStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @Override
    public Student getStudent(int studentID) {
        return repo.findById(studentID).get();
    }

    @Override
    public Student updateStudent(Student student, int studentID) {
        student.setStudentID(studentID);
        return repo.save(student);
    }

    @Override
    public void deleteStudent(int studentID) {
        repo.deleteById(studentID);
    }

    @Override
    public String deleteAllStudents() {
        repo.deleteAll();
        return "All Students have been deleted";
    }
}
