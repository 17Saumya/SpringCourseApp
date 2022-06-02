package com.onlinecourse.app.services;


import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecourse.app.Exception.CourseNotFoundException;

import com.onlinecourse.app.entities.Course;
import com.onlinecourse.app.repositories.CourseRepository;

//import com.springrest.springrest.entities.*;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getCourses() {

		return this.courseRepository.findAll();
	}

	@Override
	public Course getCourse(String courseId) throws CourseNotFoundException {
		
		
		Optional<Course>optionalCourse= this.courseRepository.findById(courseId);
		if(optionalCourse.isEmpty())throw new CourseNotFoundException("Course Not found");
		return optionalCourse.get();
	}
	
	@Override
	public Course addCourse(Course course) {

		return this.courseRepository.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		return this.courseRepository.save(course);
		
	}

	@Override
	public void deleteCourse(String courseId) {
		this.courseRepository.deleteById(courseId);
	}
}
