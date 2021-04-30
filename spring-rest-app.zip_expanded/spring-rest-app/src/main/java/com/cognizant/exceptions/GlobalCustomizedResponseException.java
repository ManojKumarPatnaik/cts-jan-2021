package com.cognizant.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalCustomizedResponseException extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		// this takes all the fields errors and adds the default messages to the list
		List<String> errors = ex.getBindingResult()
		.getFieldErrors()
		.stream()
		.map(err -> err.getDefaultMessage()).collect(Collectors.toList());
		ResponseEntity<Object> response = ResponseEntity.status(404).body(errors);
		return response;
	}
	
}
