package com.sn.proj.service;

import java.util.List;

import com.sn.proj.model.Student;

public interface IStudentService {
		
	//Create student
	void saveStudent(Student stud);
	
	//Read students
	List<Student> getAllStudents();

	//Update student
	Student getStudentById(long id);
	
	//Delete student
	void deleteStudentById(long id);
	
}
