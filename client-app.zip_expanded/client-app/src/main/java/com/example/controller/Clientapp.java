package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

// @Controller
@RestController
@RequestMapping("client")
public class Clientapp {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping(path = "store", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Test> storeEmployee() {
		Test emp = new Test();
		emp.setName("Alex");
		emp.setSalary(42000);
		String uri = "http://localhost:8081/api/employees"; // {"id":1, "name":"Alex", "salary":45000} 
		// sends post request with employee object
		ResponseEntity<Test> response= restTemplate.postForEntity(uri, emp, Test.class);
		return response;
	}
}
