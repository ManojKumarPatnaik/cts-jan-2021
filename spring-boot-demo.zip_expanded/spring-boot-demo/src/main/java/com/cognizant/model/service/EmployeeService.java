package com.cognizant.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.dao.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository dao;
	
	
}
