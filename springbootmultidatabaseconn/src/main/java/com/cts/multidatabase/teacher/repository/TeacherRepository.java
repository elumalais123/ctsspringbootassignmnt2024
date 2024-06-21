package com.cts.multidatabase.teacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.multidatabase.teacher.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
