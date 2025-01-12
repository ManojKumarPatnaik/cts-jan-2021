package com.cognizant.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.exceptions.EmployeeNotFoundException;
import com.cognizant.model.dao.EmployeeRepository;
import com.cognizant.model.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeDao;
	
	@Override
	public List<Employee> fetchEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee created = employeeDao.save(employee);
		return created;
	}

	@Override
	public Employee fetchEmployee(int id) throws EmployeeNotFoundException {
		if(employeeDao.findById(id).isPresent()) {
			Employee employee = employeeDao.findById(id).get();
			return employee;
		}
		throw new EmployeeNotFoundException("Sorry employee with an id "+id+" not found!");
		
	}

	@Override
	@Transactional
	public Employee updateSalary(int id, double salary) throws EmployeeNotFoundException {
		Employee emp = fetchEmployee(id);
		emp.setSalary(salary);
		employeeDao.save(emp);
		return emp;
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = fetchEmployee(id);
		employeeDao.delete(emp);
	}
	
}
