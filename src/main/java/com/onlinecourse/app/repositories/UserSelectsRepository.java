package com.onlinecourse.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.onlinecourse.app.entities.UserSelects;


public interface UserSelectsRepository extends MongoRepository<UserSelects, String>{

}
