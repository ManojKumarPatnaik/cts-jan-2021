package com.cognizant;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Users user = new Users(1234, "Alex", LocalDate.of(1999, 8, 22));
		
		System.out.println("Id = "+user.getUserId()+", Name = "+user.getName()+", Dob: "+user.getDob());
		System.out.println(user);
	}
}
