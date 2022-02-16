package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Student;


@Repository
//https://www.youtube.com/watch?v=9SGDpanrc8U&t=2880s
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	//https://www.youtube.com/watch?v=9SGDpanrc8U&t=4129s
//	@Query("SELECT s from Student s WHERE s.email = ?1")
	Optional<Student> findStudentByEmail(String email);

}
