package com.cts.multidatabase.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employeeId")
	private int id;
	@Column(name = "studentName")
	private String name;
	@Column(name = "studentAge")
	private String age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}
