package com.onlinecourse.app.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class FacultyControllerAdvice {
	@ExceptionHandler(FacultyNotFoundException.class)
	public ResponseEntity<String> exceptionHandler(FacultyNotFoundException c) {
		return new ResponseEntity(c.getMessage(), HttpStatus.NOT_FOUND);
	}
}
