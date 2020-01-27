package com.elm.tajsser.tajsser;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
@Component
public interface Service {

    public String addStudent(Student student);

    public List<Student> getStudents();

    public Optional<Student> getStudent(int studentID);

    public String updateStudent(Student student, int studentID);

    public String deleteStudent(int studentID);
}
