package com.elm.tajsser.tajsser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseREPO extends JpaRepository<Course, Integer> {
    @Override
    List<Course> findAll();
}
