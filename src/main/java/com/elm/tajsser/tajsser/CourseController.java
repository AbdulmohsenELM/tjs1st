package com.elm.tajsser.tajsser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping(value = "/AddCourse")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping(value = "/GetAllCourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping(value = "/GetCourse/{courseID}")
    public Course getCourse(@PathVariable("courseID") int courseID) {
        return courseService.getCourse(courseID);
    }

    @PutMapping(value = "/UpdateCourse/{courseID}")
    public Course updateCourse(@RequestBody Course course, @PathVariable("courseID") int courseID) {
        return courseService.updateCourse(course, courseID);
    }

    @DeleteMapping(value = "/DeleteCourse/{courseID}")
    public void deleteCourse(@PathVariable("courseID") int courseID) {
        courseService.deleteCourse(courseID);
    }

    @DeleteMapping(value = "/DeleteAllCourses")
    public String deleteAllCourse() {
        return courseService.deleteAllCourses();
    }
}
