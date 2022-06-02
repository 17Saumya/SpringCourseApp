package com.onlinecourse.app.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdminControllerAdvice {
		@ExceptionHandler(AdminNotFoundException.class)
		public ResponseEntity<String> exceptionHandler(AdminNotFoundException a ) {
			return new ResponseEntity(a.getMessage(), HttpStatus.NOT_FOUND);
		}

}

