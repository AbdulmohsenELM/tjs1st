package com.elm.tajsser.tajsser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @Autowired
    private ServiceImplementation serviceImplementation;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return serviceImplementation.addStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return serviceImplementation.getStudents();
    }

    @GetMapping(value = "/{studentID}")
    public Student getStudent(@PathVariable("studentID") int studentID) {
        return serviceImplementation.getStudent(studentID);
    }

    @PutMapping(value = "/{studentID}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("studentID") int studentID) {
        return serviceImplementation.updateStudent(student, studentID);
    }

    @DeleteMapping(value = "/{studentID}")
    public void deleteStudent(@PathVariable("studentID") int studentID) {
        serviceImplementation.deleteStudent(studentID);
    }
}
