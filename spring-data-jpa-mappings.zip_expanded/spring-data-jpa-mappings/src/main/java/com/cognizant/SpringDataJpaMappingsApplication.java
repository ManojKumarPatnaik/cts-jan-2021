package com.cognizant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cognizant.model.entities.Employee;
import com.cognizant.model.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaMappingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMappingsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner(ApplicationContext context) {
		return (args) -> { 
			EmployeeService service = context.getBean(EmployeeService.class);
			System.out.println("------------------ Getting a particular employee --------------------");
			Employee e = service.fetchEmployee(700);
			System.out.println(e);
		}; 
	}
}
