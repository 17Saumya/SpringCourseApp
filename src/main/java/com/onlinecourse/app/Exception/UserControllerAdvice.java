package com.onlinecourse.app.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserControllerAdvice {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String> exceptionHandler(UserNotFoundException c) {
		return new ResponseEntity(c.getMessage(), HttpStatus.NOT_FOUND);
	}

}
