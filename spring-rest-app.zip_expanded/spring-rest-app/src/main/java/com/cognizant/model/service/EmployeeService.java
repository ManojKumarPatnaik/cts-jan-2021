package com.cognizant.model.service;

import java.util.List;

import com.cognizant.exceptions.EmployeeNotFoundException;
import com.cognizant.model.entities.Employee;

public interface EmployeeService {
	public List<Employee> fetchEmployees();
	public Employee saveEmployee(Employee employee);
	public Employee fetchEmployee(int id) throws EmployeeNotFoundException;
	public Employee updateSalary(int id, double salary) throws EmployeeNotFoundException;
	public void deleteEmployee(int id)throws EmployeeNotFoundException;
	
}
