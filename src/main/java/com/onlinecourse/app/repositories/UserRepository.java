package com.onlinecourse.app.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.onlinecourse.app.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
	
}
