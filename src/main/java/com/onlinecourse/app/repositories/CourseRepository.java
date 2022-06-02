package com.onlinecourse.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.onlinecourse.app.entities.Course;

public interface CourseRepository extends MongoRepository<Course, String> {

}
