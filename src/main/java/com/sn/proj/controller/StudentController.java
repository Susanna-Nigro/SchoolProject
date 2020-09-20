package com.sn.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sn.proj.model.Student;
import com.sn.proj.service.IStudentService;
import com.sn.proj.service.ISubjectService;

@Controller
public class StudentController {
	
	@Autowired
	private IStudentService studService;
	
	@Autowired
	private ISubjectService subjService;
	
	//display list of students
	@GetMapping("/")
	public String viewHomepage() {
		return "index";
	}
	
	@GetMapping("/showStudentsPage")
	public String showStudentsPage(Model model) {
		model.addAttribute("studentList", studService.getAllStudents());
		return "students_area";
	}
	
	
	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
		Student stud = new Student();
		model.addAttribute("student", stud);
		return "new_student";
	}
	
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		//save student in db
		studService.saveStudent(student);
		return "redirect:/showStudentsPage";
	}
	
	@GetMapping("/showFormUpdate/{id}")
	public String showFormUpdate(@PathVariable (value ="id") long id, Model model) {
		
		//get student from the service
		Student stud = studService.getStudentById(id);
		
		//set students as a model attribute to pre-populate the form
		model.addAttribute("student", stud);
		return "update_student";
		
	}
	
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value="id") long id) {
		
		//call delete student method
		this.studService.deleteStudentById(id);
		
		return "redirect:/showStudentsPage";
		
	}
	
	
	@GetMapping("/showSubjectsPage")
	public String showSubjectsPage(Model model) {
		model.addAttribute("subjectList", subjService.getAllSubjects());
		return "subjects_area";
	}
	
}
