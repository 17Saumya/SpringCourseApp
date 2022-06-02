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

import com.onlinecourse.app.Exception.CourseNotFoundException;
import com.onlinecourse.app.entities.Course;
import com.onlinecourse.app.services.CourseService;

@RestController
@CrossOrigin
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	/*
	 * @GetMapping("/home") public String home() { return
	 * "welcome to courses application"; }
	 */
	//to get courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
			return this.courseService.getCourses();
		}
	//to get single course
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) throws CourseNotFoundException
	{
		return this.courseService.getCourse((courseId));
	}
	//add course
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course Course) 
	{
		return this.courseService.addCourse(Course);
	}
	//update course using PUT method
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course Course)
	{
		return this.courseService.updateCourse(Course);
	}
	
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseService.deleteCourse((courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
