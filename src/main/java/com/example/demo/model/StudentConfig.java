package com.example.demo.model;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.repository.StudentRepository;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner
		(StudentRepository repository) {
		return args -> {
			Student takeshi = new Student(
					"Takeshi", 
					"t.kimoto@gmail.com", 
					LocalDate.of(2000, Month.JANUARY, 5),
					21
			);
			Student etsuko = new Student(
					"Etsuko",
					"e.kimoto@gmail.com",
					LocalDate.of(1950, Month.OCTOBER, 20),
					70
			);
			
			repository.saveAll(
					List.of(takeshi, etsuko)
			);
			
		};
	}

}
