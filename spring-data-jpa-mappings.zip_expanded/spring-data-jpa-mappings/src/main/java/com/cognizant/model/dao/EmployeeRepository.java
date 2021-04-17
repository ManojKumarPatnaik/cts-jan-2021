package com.cognizant.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
