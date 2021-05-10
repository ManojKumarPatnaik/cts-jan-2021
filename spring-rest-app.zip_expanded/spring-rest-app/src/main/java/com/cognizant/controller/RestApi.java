package com.cognizant.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.exceptions.EmployeeNotFoundException;
import com.cognizant.model.entities.Employee;
import com.cognizant.model.service.EmployeeService;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
public class RestApi {

	@Autowired
	private EmployeeService service;
	
	
	
	@PostMapping(path = "employees", 
			consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, 
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Object> storeApi(@Valid @RequestBody Employee emp) {
		Employee createdEmployee = service.saveEmployee(emp);
		ResponseEntity<Object> responseEntity = ResponseEntity.status(201).body(createdEmployee);
		return responseEntity;
	}

	@GetMapping(path = "employees",
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Employee> getEmployeesApi() {
		return service.fetchEmployees();
	}
	

	@GetMapping(path = "employees/{id}", 
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Object> getEmployeesByIdApi(@PathVariable int id) {
		ResponseEntity<Object> responseEntity = null;
		try {
			Employee employee = service.fetchEmployee(id);
			responseEntity = ResponseEntity.status(200).body(employee);
		} catch(EmployeeNotFoundException exception) {
			String message = exception.getMessage(); // {"msg":"Sorry employee with id 100 not found"}
			ResponseModel err = new ResponseModel(message);
			responseEntity = ResponseEntity.status(404).body(err);
		}
		return responseEntity;
	}
	
	@DeleteMapping(path = "employees/{id}", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Object> deleteEmployeeByIdApi(@PathVariable int id) {
		ResponseEntity<Object> responseEntity = null;
		try {
			service.deleteEmployee(id);
			ResponseModel success = new ResponseModel("Employee with an id "+id+" deleted!");
			responseEntity = ResponseEntity.status(200).body(success);
		} catch(EmployeeNotFoundException exception) {
			String message = exception.getMessage(); // {"msg":"Sorry employee with id 100 not found"}
			ResponseModel err = new ResponseModel(message);
			responseEntity = ResponseEntity.status(404).body(err);
		}
		return responseEntity;
	}
	
	@PutMapping(path = "employees/{id}/{salary}",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
	public ResponseEntity<Object> updateEmployeeByIdApi(@PathVariable int id, @PathVariable double salary) {
		ResponseEntity<Object> responseEntity = null;
		try {
			Employee employee = service.updateSalary(id, salary);
			responseEntity = ResponseEntity.status(200).body(employee);
		} catch(EmployeeNotFoundException exception) {
			String message = exception.getMessage(); // {"msg":"Sorry employee with id 100 not found"}
			ResponseModel err = new ResponseModel(message);
			responseEntity = ResponseEntity.status(404).body(err);
		}
		return responseEntity;
	}
}
