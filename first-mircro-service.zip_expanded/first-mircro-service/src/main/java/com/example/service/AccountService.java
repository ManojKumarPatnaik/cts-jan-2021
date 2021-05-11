package com.example.service;

import org.springframework.stereotype.Service;

import com.example.beans.Account;

@Service
public class AccountService {

	public Account debit() {
		Account account = new Account();
		account.setAmount(5000);
		System.out.println("--------------------debit() is called ------------------------");
		return account;
	}
}
