package com.example.c.repository;

import com.example.c.entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SemesterRepository  extends JpaRepository<Semester, Long> {
    List<Semester> findAll();
}
