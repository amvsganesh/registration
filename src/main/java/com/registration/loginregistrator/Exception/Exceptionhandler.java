package com.registration.loginregistrator.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.registration.loginregistrator.DTO.JSONResponse;


@RestControllerAdvice
public class Exceptionhandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<JSONResponse> resourceNotFoundException(ResourceNotFoundException exception) {
		String exceptionmessage=exception.getMessage();
		JSONResponse messsage=new JSONResponse(exceptionmessage);
		return new ResponseEntity<>(messsage,HttpStatus.NOT_FOUND);
		
	}
}
