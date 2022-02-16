package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping(path = "api/v1/students")

	public class StudentController {

	
//	https://www.youtube.com/watch?v=9SGDpanrc8U&t=1824s.
	private final StudentService studentService;
	
	@Autowired
//	https://www.youtube.com/watch?v=9SGDpanrc8U&t=1770s.
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
//  commenting out 20-23 and uncommenting below does not work.
//	public StudentController(StudentService studentService) {
//		this.studentService = studentService;
//	}
		
	@GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
}
