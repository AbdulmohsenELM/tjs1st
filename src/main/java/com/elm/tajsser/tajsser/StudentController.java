package com.elm.tajsser.tajsser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Students")
public class StudentController {
    @Autowired
    private Service service;

    @PostMapping(value = "/AddStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping(value = "/GetAllStudents")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping(value = "/GetStudent/{studentID}")
    public Student getStudent(@PathVariable("studentID") int studentID) {
        return service.getStudent(studentID);
    }

    @PutMapping(value = "/UpdateStudent/{studentID}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("studentID") int studentID) {
        return service.updateStudent(student, studentID);
    }

    @DeleteMapping(value = "/DeleteStudent/{studentID}")
    public void deleteStudent(@PathVariable("studentID") int studentID) {
        service.deleteStudent(studentID);
    }

    @DeleteMapping(value = "/DeleteAllStudents")
    public String deleteAllStudent() {
        return service.deleteAllStudents();
    }
}
