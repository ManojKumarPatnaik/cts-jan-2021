package com.cognizant.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.model.dao.EmployeeRepository;
import com.cognizant.model.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository dao;
	
	public List<Employee> fetchAllEmployees() {
		List<Employee> employees = dao.findAll();
		return employees;
	}
	
	public Employee storeEmployee(Employee employee) {
		return dao.save(employee);
	}
	
	public Employee fetchEmployee(int id) {
		return dao.findById(id).get();
	}
	
	@Transactional
	public void modifyEmployeesSalary(double salary) {
		dao.updateEmployeeSalary(salary);
	}
}
