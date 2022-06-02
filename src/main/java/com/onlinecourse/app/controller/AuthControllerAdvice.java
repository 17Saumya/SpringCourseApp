package com.onlinecourse.app.controller;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onlinecourse.app.Exception.LoginException;
import com.onlinecourse.app.Exception.AuthException;

@RestControllerAdvice
public class AuthControllerAdvice {
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(AuthException.class)
	public String exceptionHandler(Exception e) {
		return e.getMessage();
	}
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(LoginException.class)
	public String loginExceptionHandler(Exception e) {
		return e.getMessage();
	}
}
