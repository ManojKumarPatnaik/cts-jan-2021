package com.cognizant.exceptions;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException() {
		super("Sorry employee not found");
	}
	
	public EmployeeNotFoundException(String err) {
		super(err);
	}
}
