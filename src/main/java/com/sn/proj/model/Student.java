package com.sn.proj.model;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "surname")
	private String surname;
	@Column(name = "year")
	private int year;
	@Column(name = "section")
	private String section;
	
	public Student() {}
	
	public Student(long id, String name, String surname, int year, String section) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.year = year;
		this.section = section;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	public String toString() {
		String risp = "Student details - Id: " + getId() + " / Name: " + getName() + " / Surname: " + getSurname() +
				" / Year: " + getYear() + " / Section: " + getSection();
		System.out.println(risp);
		return risp;
	}
    
}
