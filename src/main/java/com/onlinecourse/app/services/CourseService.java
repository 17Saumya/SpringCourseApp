package com.onlinecourse.app.services;

import java.util.List;

import com.onlinecourse.app.Exception.CourseNotFoundException;
import com.onlinecourse.app.entities.Course;

public interface CourseService {

	
	public List<Course> getCourses();
	
	public Course getCourse(String courseId) throws CourseNotFoundException;

	public Course addCourse(Course Course);
	
	public Course updateCourse(Course Course);
	
	public void deleteCourse(String courseId);
	
}

