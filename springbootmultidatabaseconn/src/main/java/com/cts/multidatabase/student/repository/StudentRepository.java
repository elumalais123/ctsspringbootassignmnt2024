package com.cts.multidatabase.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.multidatabase.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
