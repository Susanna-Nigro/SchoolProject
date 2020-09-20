package com.sn.proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.proj.model.Subject;
import com.sn.proj.repository.ISubjectRepo;

@Service
public class SubjectServiceImpl implements ISubjectService {

	@Autowired
	private ISubjectRepo subjRepo;


	@Override
	public List<Subject> getAllSubjects() {
		return subjRepo.findAll();
	}
	
}
