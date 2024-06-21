package com.cts.multidatabase.teacher.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "teacherId")
	private int id;
	@Column(name = "teacherName")
	private String name;
	@Column(name = "teacherAge")
	private String age;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
