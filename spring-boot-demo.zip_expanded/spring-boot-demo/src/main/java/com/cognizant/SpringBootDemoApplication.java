package com.cognizant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cognizant.model.service.EmployeeService;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			EmployeeService service = ctx.getBean(EmployeeService.class);
			service.testEmp();
			System.out.println("----------------------");
			service.testAnotherEmp();
		};
	}

}
