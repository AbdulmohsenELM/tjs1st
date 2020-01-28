package com.elm.tajsser.tajsser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @Autowired
    private Service service;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping(value = "/{studentID}")
    public Student getStudent(@PathVariable("studentID") int studentID) {
        return service.getStudent(studentID);
    }

    @PutMapping(value = "/{studentID}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("studentID") int studentID) {
        return service.updateStudent(student, studentID);
    }

    @DeleteMapping(value = "/{studentID}")
    public void deleteStudent(@PathVariable("studentID") int studentID) {
        service.deleteStudent(studentID);
    }
}
