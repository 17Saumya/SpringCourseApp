package com.onlinecourse.app.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserSelectsControllerAdvice {
	@ExceptionHandler(UserSelectsNotFoundException.class)
	public ResponseEntity<String> exceptionHandler(UserSelectsNotFoundException c) {
		return new ResponseEntity(c.getMessage(), HttpStatus.NOT_FOUND);
	}

	
	
}
