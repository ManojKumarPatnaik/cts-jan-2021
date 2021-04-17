package com.cognizant.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.dao.StatesRepository;
import com.cognizant.model.entities.States;

@Service
public class StatesService {

	@Autowired
	private StatesRepository statesDao;
	
	public States fetchState(int stateId) {
		return statesDao.findById(stateId).get();
	}
}
