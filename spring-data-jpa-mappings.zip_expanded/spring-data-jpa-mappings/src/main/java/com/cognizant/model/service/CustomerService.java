package com.cognizant.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.dao.CustomerRepository;
import com.cognizant.model.entities.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerDao;
	
	public List<Customer> fetchCustomers() {
		return customerDao.findAll();
	}
}
