package com.sn.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sn.proj.model.Student;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Long> {
	
}
