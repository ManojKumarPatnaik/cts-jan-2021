package com.cognizant.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.model.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("select e from Employee e where e.salary > ?1")
	public List<Employee> findEmployeeBySalary(double salary);
	
	@Modifying
	@Query("update Employee e set e.salary = ?1")
	public void updateEmployeeSalary(double salary);
}
