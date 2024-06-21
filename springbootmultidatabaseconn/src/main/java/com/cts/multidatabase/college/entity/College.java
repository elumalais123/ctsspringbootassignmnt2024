package com.cts.multidatabase.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "college")
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "collegeId")
	int id;
	@Column(name = "collegeName")
	String name;
	@Column(name = "collegeLocation")
	String location;
	
	public College() {
		// TODO Auto-generated constructor stub
	}
	public College(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	
}
