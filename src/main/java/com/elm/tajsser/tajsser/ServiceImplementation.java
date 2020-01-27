package com.elm.tajsser.tajsser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
@RestController
@RequestMapping(value = "/students")
public class ServiceImplementation implements Service {

    @Autowired
    private StudentREPO repo;

    @Override
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        repo.save(student);
        return "Student added Successfully";
    }

    @Override
    @GetMapping
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @Override
    @GetMapping(value = "/{studentID}")
    public Optional<Student> getStudent(@PathVariable("studentID") int studentID) {
        return repo.findById(studentID);
    }

    @Override
    @PutMapping(value = "/{studentID}")
    public String updateStudent(@RequestBody Student student, @PathVariable("studentID") int studentID) {
        student.setStudentID(studentID);
        repo.save(student);
        return "Student updated Successfully";
    }

    @Override
    @DeleteMapping(value = "/{studentID}")
    public String deleteStudent(@PathVariable("studentID") int studentID) {
        repo.deleteById(studentID);
        return "Student deleted Successfully";
    }
}
