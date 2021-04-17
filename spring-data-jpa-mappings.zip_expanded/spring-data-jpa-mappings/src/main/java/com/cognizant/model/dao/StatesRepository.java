package com.cognizant.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.entities.States;

public interface StatesRepository extends JpaRepository<States, Integer> {

}
