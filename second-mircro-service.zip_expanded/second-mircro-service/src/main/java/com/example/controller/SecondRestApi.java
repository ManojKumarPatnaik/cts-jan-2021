package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Client;
import com.example.beans.Account;
import com.example.beans.Wallet;

@RestController
@RequestMapping("second")
public class SecondRestApi {

	// you need to autowire the RestTemplate in the service layer
	@Autowired
	private RestTemplate template;
	
	// you need to autowire the feign client
	@Autowired
	private Client client;

	@PostMapping
	public Wallet addAmount() {
		//Account account = template.postForObject("http://FIRST/first", null, Account.class);
		Account account = client.getAccount();
		Wallet wallet = new Wallet();
		wallet.setWalletNo(12345);
		wallet.setBalance(wallet.getBalance() + account.getAmount());
		return wallet;
	}
}
