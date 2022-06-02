package com.onlinecourse.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.onlinecourse.app.entities.Faculty;

public interface FacultyRepository extends MongoRepository<Faculty, String> {

}
