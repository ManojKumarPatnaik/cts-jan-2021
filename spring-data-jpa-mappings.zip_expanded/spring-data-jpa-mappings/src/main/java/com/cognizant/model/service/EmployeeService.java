package com.cognizant.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.dao.EmployeeRepository;
import com.cognizant.model.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeDao;
	
	public Employee fetchEmployee(int id) {
		return employeeDao.findById(id).get();
	}
	
	public List<Employee> fetchEmployees() {
		return employeeDao.findAll();
	}
}
