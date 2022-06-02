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
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinecourse.app.Exception.CourseSelectedNotFoundException;
import com.onlinecourse.app.entities.CourseSelected;
import com.onlinecourse.app.services.CourseSelectedService;




@RestController
@CrossOrigin
public class CourseSelectedController {

	@Autowired
	private CourseSelectedService csservice;
	
	//to get 
	@GetMapping("/allselects")
	public List<CourseSelected> getCoursesSelected(){
			return this.csservice.getCoursesSelected();
		}
	//to get single course select
	@GetMapping("/singleselect/{singleselectId}")
	public CourseSelected getCourseSelected(@PathVariable String CourseSelectedId) throws  CourseSelectedNotFoundException
	{
		return this.csservice.getCourseSelected((CourseSelectedId));
	}
	//add admin
	@PostMapping("/courseselect")
	public CourseSelected addCourseSelected(@RequestBody CourseSelected CourseSelected) 
	{
		return this.csservice.addCourseSelected(CourseSelected);
	}
	//update admin using PUT method
	@PutMapping("/courseselect")
	public  CourseSelected updateCourseSelected(@RequestBody CourseSelected CourseSelected)
	{
		return this.csservice.updateCourseSelected(CourseSelected);
	}
	
	//Delete Admin
	@DeleteMapping("/singledelete/{singledeleteId}")
	public ResponseEntity<HttpStatus> deleteCourseSelected(@PathVariable String CourseSelectedId){
		try {
			this.csservice.deleteCourseSelected((CourseSelectedId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception a) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}
