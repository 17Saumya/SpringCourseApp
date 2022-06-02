package com.onlinecourse.app.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.onlinecourse.app.Exception.UserNotFoundException;

import com.onlinecourse.app.entities.User;
import com.onlinecourse.app.services.UserService;


@RestController
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService;
	
	//to get courses
	@GetMapping("/users")
	public List<User> getUsers(){
			return this.userService.getUsers();
		}
	//to get single course
	@GetMapping("/user/{userEmailId}")
	public User getUser(@PathVariable String userId) throws UserNotFoundException
	{
		return this.userService.getUser((userId));
	}
	//add course
	@PostMapping("/user")
	public User addUser(@RequestBody  User user) 
	{
		return this.userService.addUser(user);
	}
	//update course using PUT method
	@PutMapping("/user")
	public User updateUser(@RequestBody  User user)
	{
		return this.userService.updateUser(user);
	}
	
	@DeleteMapping("/user/{userEmailId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userEmailId){
		try {
			this.userService.deleteUser((userEmailId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception c) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}


