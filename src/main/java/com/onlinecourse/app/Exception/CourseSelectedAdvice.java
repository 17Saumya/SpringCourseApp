package com.onlinecourse.app.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class CourseSelectedAdvice {

	@ExceptionHandler(CourseSelectedNotFoundException.class)
	public ResponseEntity<String> exceptionHandler(CourseSelectedNotFoundException c) {
		return new ResponseEntity(c.getMessage(), HttpStatus.NOT_FOUND);
	}
	
}
