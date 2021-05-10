package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Account;
import com.example.service.AccountService;

@RestController
@RequestMapping("first")
public class FirstRestApi {

	@Autowired
	private AccountService service;
	
	@GetMapping
	public String greetings() {
		return "Hello First Microservice";
	}
	
	@PostMapping
	public ResponseEntity<Object> debitApi() {
		Account account = service.debit();
		return ResponseEntity.status(200).body(account);
	}
}
