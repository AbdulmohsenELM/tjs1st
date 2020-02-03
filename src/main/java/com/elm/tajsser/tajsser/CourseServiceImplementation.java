package com.elm.tajsser.tajsser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService {

    @Autowired
    private CourseREPO repo;

    @Override
    public Course addCourse(Course course) {
        return repo.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    @Override
    public Course getCourse(int courseID) {
        return repo.findById(courseID).get();
    }

    @Override
    public Course updateCourse(Course course, int courseID) {
        course.setId(courseID);
        return repo.save(course);
    }

    @Override
    public void deleteCourse(int courseID) {
        repo.deleteById(courseID);
    }

    @Override
    public String deleteAllCourses() {
        repo.deleteAll();
        return "All Courses have been deleted";
    }
}
