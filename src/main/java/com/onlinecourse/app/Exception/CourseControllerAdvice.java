package com.onlinecourse.app.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class CourseControllerAdvice {
	@ExceptionHandler(CourseNotFoundException.class)
	public ResponseEntity<String> exceptionHandler(CourseNotFoundException c) {
		return new ResponseEntity(c.getMessage(), HttpStatus.NOT_FOUND);
	}

}

