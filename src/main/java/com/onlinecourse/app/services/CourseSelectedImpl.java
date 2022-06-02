package com.onlinecourse.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onlinecourse.app.Exception.CourseSelectedNotFoundException;
import com.onlinecourse.app.entities.CourseSelected;
import com.onlinecourse.app.repositories.CourseSelectedRepository;

@Service
public class CourseSelectedImpl implements CourseSelectedService {
	@Autowired
	private CourseSelectedRepository courseSelectedRepository;
	@Override
	public List<CourseSelected> getCoursesSelected() {
		// TODO Auto-generated method stub
		return this.courseSelectedRepository.findAll();
	}

	@Override
	public CourseSelected getCourseSelected(String CourseSelectedId) throws CourseSelectedNotFoundException {
		// TODO Auto-generated method stub
		Optional<CourseSelected> optionalCourseSelected = this.courseSelectedRepository.findById(CourseSelectedId);
		if (optionalCourseSelected.isEmpty())
			throw new CourseSelectedNotFoundException("Selected Course Not found");
		return optionalCourseSelected.get();
	}

	@Override
	public CourseSelected addCourseSelected(CourseSelected CourseSelected) {
		// TODO Auto-generated method stub
		return this.courseSelectedRepository.save(CourseSelected);
	}

	@Override
	public CourseSelected updateCourseSelected(CourseSelected CourseSelected) {
		// TODO Auto-generated method stub
		return this.courseSelectedRepository.save(CourseSelected);
	}

	@Override
	public void deleteCourseSelected(String CourseSelectedId) {
		// TODO Auto-generated method stub
		this.courseSelectedRepository.deleteById(CourseSelectedId);
	}

}
