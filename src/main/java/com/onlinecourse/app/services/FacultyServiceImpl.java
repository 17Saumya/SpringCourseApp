package com.onlinecourse.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecourse.app.Exception.FacultyNotFoundException;
import com.onlinecourse.app.entities.Faculty;
import com.onlinecourse.app.repositories.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	private FacultyRepository facultyRepository;

	@Override
	public List<Faculty> getFaculties() {
		// TODO Auto-generated method stub
		return this.facultyRepository.findAll();
	}

	@Override
	public Faculty getFaculty(String facultyId) throws FacultyNotFoundException {
		// TODO Auto-generated method stub
		Optional<Faculty>optionalFaculty= this.facultyRepository.findById(facultyId);
		if(optionalFaculty.isEmpty())throw new FacultyNotFoundException("Faculty Not found");
		return optionalFaculty.get();
	}

	@Override
	public Faculty addFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return this.facultyRepository.save(faculty);
	}

	@Override
	public Faculty updateFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return this.facultyRepository.save(faculty);
	}

	@Override
	public void deleteFaculty(String facultyId) {
		// TODO Auto-generated method stub
		this.facultyRepository.deleteById(facultyId);
	}

	
	
}
