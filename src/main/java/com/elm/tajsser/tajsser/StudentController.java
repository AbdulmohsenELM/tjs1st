package com.elm.tajsser.tajsser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/AddStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping(value = "/GetAllStudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping(value = "/GetStudent/{studentID}")
    public Student getStudent(@PathVariable("studentID") int studentID) {
        return studentService.getStudent(studentID);
    }

    @PutMapping(value = "/UpdateStudent/{studentID}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("studentID") int studentID) {
        return studentService.updateStudent(student, studentID);
    }

    @DeleteMapping(value = "/DeleteStudent/{studentID}")
    public void deleteStudent(@PathVariable("studentID") int studentID) {
        studentService.deleteStudent(studentID);
    }

    @DeleteMapping(value = "/DeleteAllStudents")
    public String deleteAllStudent() {
        return studentService.deleteAllStudents();
    }
}
