package com.onlinecourse.app.services;

import java.util.List;

import com.onlinecourse.app.Exception.CourseSelectedNotFoundException;
import com.onlinecourse.app.entities.CourseSelected;

public interface CourseSelectedService {
	
	public List<CourseSelected> getCoursesSelected();
	
	public  CourseSelected getCourseSelected(String CourseSelectedId) throws CourseSelectedNotFoundException;

	public CourseSelected addCourseSelected(CourseSelected CourseSelected);
	
	public CourseSelected updateCourseSelected(CourseSelected CourseSelected);
	
	public void deleteCourseSelected(String CourseSelectedId);
	
}
