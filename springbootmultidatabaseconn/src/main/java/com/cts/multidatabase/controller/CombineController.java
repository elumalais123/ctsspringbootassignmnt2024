package com.cts.multidatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.multidatabase.college.repository.CollegeRepository;
import com.cts.multidatabase.model.Response;
import com.cts.multidatabase.student.repository.StudentRepository;
import com.cts.multidatabase.teacher.repository.TeacherRepository;

@RestController
public class CombineController {

    @Autowired
    CollegeRepository collegeRepository;
    @Autowired
    StudentRepository studentRepository;
    
    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping(value = "/")
    public Response getResponse(){
        Response response = new Response();
        response.setStudents(studentRepository.findAll());
        response.setColleges(collegeRepository.findAll());
        response.setTeacher(teacherRepository.findAll());
        return response;
    }
}
