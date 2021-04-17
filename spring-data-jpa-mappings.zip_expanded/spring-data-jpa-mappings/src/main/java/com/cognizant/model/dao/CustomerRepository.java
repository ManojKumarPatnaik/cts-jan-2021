package com.cognizant.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
