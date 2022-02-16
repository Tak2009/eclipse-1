package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		
	@GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	//https://www.youtube.com/watch?v=9SGDpanrc8U&t=3787s.
	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);
		
	}
	
	//https://www.youtube.com/watch?v=9SGDpanrc8U&t=4538s.
	@DeleteMapping(path = "{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long studentId) {
		studentService.deleteStudent(studentId);
	}
	
	//https://www.youtube.com/watch?v=9SGDpanrc8U&t=4979s.
	@PutMapping(path = "{studentId}")
	public void updateStudent(
			@PathVariable("studentId") Long studentId,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String email) {
		studentService.updateStudent(studentId, name, email);
	}
		
}
