package com.cognizant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cognizant.model.entities.Employee;
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
			
//			Employee emp = new Employee();
//			emp.setEmpId(700);
//			emp.setName("George");
//			emp.setSalary(29000);
//			Employee created = service.storeEmployee(emp);
//			System.out.println(created);
			service.modifyEmployeesSalary(75000);
			service.fetchAllEmployees().forEach(item -> System.out.println(item));
		};
	}

}
