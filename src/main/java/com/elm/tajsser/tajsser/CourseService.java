package com.elm.tajsser.tajsser;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface CourseService {

    public Course addCourse(Course course);
    public List<Course> getAllCourses();
    public Course getCourse(int courseID);
    public Course updateCourse(Course course, int courseID);
    public void deleteCourse(int courseID);
    public String deleteAllCourses();
}
