package com.elm.tajsser.tajsser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentREPO extends JpaRepository<Student, Integer> {
    @Override
    List<Student> findAll();
}
