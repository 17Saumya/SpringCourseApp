package com.onlinecourse.app.services;

import java.util.List;

import com.onlinecourse.app.Exception.FacultyNotFoundException;
import com.onlinecourse.app.entities.Faculty;


public interface FacultyService {
	
public List<Faculty> getFaculties();
	
	public Faculty getFaculty(String facultyId) throws FacultyNotFoundException;

	public Faculty addFaculty(Faculty Faculty);
	
	public Faculty updateFaculty(Faculty Faculty);
	
	public void deleteFaculty(String facultyId);

}
