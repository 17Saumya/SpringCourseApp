package com.onlinecourse.app.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.onlinecourse.app.entities.Admin;
import com.onlinecourse.app.entities.User;

public interface AdminRepository extends MongoRepository<Admin, String> {
	/*Optional<User> findByUsername(String username);
	  Boolean existsByUsername(String username);*/
}
