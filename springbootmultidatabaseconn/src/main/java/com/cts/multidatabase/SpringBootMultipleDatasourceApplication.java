package com.cts.multidatabase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cts.multidatabase.college.entity.College;
import com.cts.multidatabase.college.repository.CollegeRepository;
import com.cts.multidatabase.student.entity.Student;
import com.cts.multidatabase.student.repository.StudentRepository;
import com.cts.multidatabase.teacher.entity.Teacher;
import com.cts.multidatabase.teacher.repository.TeacherRepository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootMultipleDatasourceApplication {

	private final CollegeRepository collegeRepository;

	private final StudentRepository studentRepository;
	
	private final TeacherRepository teacherRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultipleDatasourceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {

			College college = new College(10, "JNTU", "HYD");
			collegeRepository.save(college);

			Student student = new Student(1, "Rani", "22");
			studentRepository.save(student);
			

			Teacher teacher = new Teacher(1, "Rani", "22");
			teacherRepository.save(teacher);

		};
	}
}
