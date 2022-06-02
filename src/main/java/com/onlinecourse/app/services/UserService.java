package com.onlinecourse.app.services;

import java.util.List;

import com.onlinecourse.app.Exception.UserNotFoundException;

import com.onlinecourse.app.entities.User;

public interface UserService {

public List<User> getUsers();
	
	public User getUser(String userEmailId) throws UserNotFoundException;

	public User addUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(String userEmailId);
	
}
