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
			Student tom = new Student(
					"Tom", 
					"t.smith@gmail.com", 
					LocalDate.of(2000, Month.JANUARY, 5)
			);
			Student oscar = new Student(
					"Oscar",
					"o.smith@gmail.com",
					LocalDate.of(1950, Month.OCTOBER, 20)
			);
			
			repository.saveAll(
					List.of(tom, oscar)
			);
			
		};
	}

}
