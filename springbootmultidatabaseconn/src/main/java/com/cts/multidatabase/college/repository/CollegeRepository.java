package com.cts.multidatabase.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.multidatabase.college.entity.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {
}
