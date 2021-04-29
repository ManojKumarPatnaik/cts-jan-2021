package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.entities.Employee;
import com.cognizant.model.service.EmployeeService;

@RestController
@RequestMapping("api")
public class RestApi {

	@Autowired
	private EmployeeService service;
	
	@PostMapping(path = "employees", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee storeApi(@RequestBody Employee emp) {
		Employee createdEmployee = service.saveEmployee(emp);
		return createdEmployee;
	}

	@GetMapping(path = "employees", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeesApi() {
		return service.fetchEmployees();
	}
	

	@GetMapping(path = "employees/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeesByIdApi(@PathVariable int id) {
		return service.fetchEmployee(id);
	}
	
	
}
