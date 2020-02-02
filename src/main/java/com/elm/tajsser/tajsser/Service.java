package com.elm.tajsser.tajsser;
import java.util.List;
@org.springframework.stereotype.Service

public interface Service {

    public Student addStudent(Student student);

    public List<Student> getStudents();

    public Student getStudent(int studentID);

    public Student updateStudent(Student student, int studentID);

    public void deleteStudent(int studentID);

    public String deleteAllStudents();
}
