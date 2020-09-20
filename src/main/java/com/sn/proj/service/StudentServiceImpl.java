package com.sn.proj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.proj.model.Student;
import com.sn.proj.repository.IStudentRepo;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentRepo studRepo;
	
	@Override
	public List<Student> getAllStudents() {		
		return studRepo.findAll();
	}

	@Override
	public void saveStudent(Student stud) {
		this.studRepo.save(stud);		
	}

	@Override
	public Student getStudentById(long id) {
		Optional<Student> optional = studRepo.findById(id);
		Student stud = null;
		
		if(optional.isPresent()) {
			stud = optional.get();
		} else {
			throw new RuntimeException(" Student not found for id ::" + id);
		}
		
		return stud;
	}

	@Override
	public void deleteStudentById(long id) {
		this.studRepo.deleteById(id);
		
	}
}
