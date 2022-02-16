package com.example.demo.model;
import java.time.LocalDate;
import java.time.Period;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@javax.persistence.Entity
@Table(name="students")
//  https://www.youtube.com/watch?v=9SGDpanrc8U&t=2424s
//  https://qiita.com/ughirose/items/5d691adc677aa08636b8
public class Student {
//	sequenceGeneratorについて：　http://itdoc.hitachi.co.jp/manuals/link/cosmi_v0870/APR4/EU260108.HTM
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1
	)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			
	)
	
	private Long id;
	private String name;
	private String email;
	private LocalDate dob;
//  https://www.youtube.com/watch?v=9SGDpanrc8U&t=3540s
	@Transient
	private Integer age;

//in the tutorial, this does not exist but without this, an error triggered: No default constructor for entity:  : com.example.demo.model.Student; nested exception is org.hibernate.InstantiationException: 	
//to resolve, refer to this: https://www.yawintutor.com/unexpected-error-no-default-constructor-for-entity/
public Student() {
}
	
public Student(Long id, String name, String email, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		
}

//for db. no id as it is automatically generated
public Student(String name, String email, LocalDate dob) {
	this.name = name;
	this.email = email;
	this.dob = dob;
}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return Period.between(this.dob, LocalDate.now()).getYears();
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}
	
	
	
}
