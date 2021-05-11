package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.beans.Account;

@FeignClient("FIRST")
public interface Client {
	@PostMapping("first")
	public Account getAccount();
}
