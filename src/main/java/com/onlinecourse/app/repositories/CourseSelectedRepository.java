package com.onlinecourse.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.onlinecourse.app.entities.CourseSelected;

public interface CourseSelectedRepository extends MongoRepository<CourseSelected, String> {

}
