package com.sn.proj.model;

import javax.persistence.*;

@Entity
@Table(name="Subjects")
public class Subject {
	
	@Id
	@Column(name="code")
	private String code;
	@Column(name="subject")
	private String subject;
	@Column(name="year")
	private int year;
	
	public Subject() {}
	
	public Subject(String code, String subject, int year) {
		super();
		this.code = code;
		this.subject = subject;
		this.year = year;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
