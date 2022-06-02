package com.onlinecourse.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onlinecourse.app.Exception.UserNotFoundException;

import com.onlinecourse.app.entities.User;
import com.onlinecourse.app.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> getUsers() {
		return this.userRepository.findAll();
		
	}
	@Override
	public User getUser(String userEmailId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Optional<User>optionalUser= this.userRepository.findById(userEmailId);
		if(optionalUser.isEmpty())throw new UserNotFoundException("User Not found");
		return optionalUser.get();
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public void deleteUser(String userEmailId) {
		// TODO Auto-generated method stub
		
		this.userRepository.deleteById(userEmailId);
	}
	
}
