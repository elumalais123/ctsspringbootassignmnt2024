package com.cts.multidatabase.model;

import lombok.Data;

import java.util.List;

import com.cts.multidatabase.college.entity.College;
import com.cts.multidatabase.student.entity.Student;
import com.cts.multidatabase.teacher.entity.Teacher;

@Data
public class Response {
    List<Student> students;
    List<College> colleges;
    List<Teacher> teacher;
    
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<College> getColleges() {
		return colleges;
	}
	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
    
    
}
