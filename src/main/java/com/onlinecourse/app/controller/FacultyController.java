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

import com.onlinecourse.app.Exception.FacultyNotFoundException;
import com.onlinecourse.app.entities.Faculty;
import com.onlinecourse.app.services.FacultyService;

@RestController
@CrossOrigin
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;
	//to get courses
	@GetMapping("/faculties")
	public List<Faculty> getFaculties(){
			return this.facultyService.getFaculties();
		}
	//to get single faculty
	@GetMapping("/faculty/{facultyId}")
	public Faculty getFaculty(@PathVariable String facultyId) throws FacultyNotFoundException
	{
		return this.facultyService.getFaculty((facultyId));
	}
	//add faculty
	@PostMapping("/faculty")
	public Faculty addFaculty(@RequestBody Faculty Faculty) 
	{
		return this.facultyService.addFaculty(Faculty);
	}
	//update Faculty using PUT method
	@PutMapping("/faculty")
	public Faculty updateFaculty(@RequestBody Faculty Faculty)
	{
		return this.facultyService.updateFaculty(Faculty);
	}
	
	//Delete Faculty
	@DeleteMapping("/faculty/{facultyId}")
	public ResponseEntity<HttpStatus> deleteFaculty(@PathVariable String facultyId){
		try {
			this.facultyService.deleteFaculty((facultyId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception a) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}


