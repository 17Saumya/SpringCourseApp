package com.onlinecourse.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.onlinecourse.app.Exception.UserSelectsNotFoundException;
import com.onlinecourse.app.entities.UserSelects;
import com.onlinecourse.app.services.UserSelectsService;

@RestController
@CrossOrigin
public class UserSelectsController {
			
	@Autowired
	private UserSelectsService userSelectService;
	
	//to get user selects
	@GetMapping("/userselects")
	public List<UserSelects> getUselects(){
			return this.userSelectService.getUselects();
		}
	//to get single course selected by user
	@GetMapping("/userselect/{userselectId}")
	public  UserSelects getUselect(@PathVariable String UId) throws UserSelectsNotFoundException
	{
		return this.userSelectService.getUselect((UId));
	}
	//add course selected by user 
	@PostMapping("/userselect")
	public  UserSelects addUselect(@RequestBody UserSelects uselect) 
	{
		return this.userSelectService.addUselect(uselect);
	}
	//update course selected by user
	@PutMapping("/userselect")
	public UserSelects updateUselect(@RequestBody UserSelects uselect)
	{
		return this.userSelectService.updateUselect(uselect);
	}
	
	@DeleteMapping("/userselect/{userselectId}")
	public ResponseEntity<HttpStatus> deleteUSelects(@PathVariable String  UId){
		try {
			this.userSelectService.deleteUSelects((UId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
		
}
