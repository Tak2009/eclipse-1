package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Student;


@Repository
//https://www.youtube.com/watch?v=9SGDpanrc8U&t=2880s
public interface StudentRepository extends JpaRepository<Student, Long>{

}
