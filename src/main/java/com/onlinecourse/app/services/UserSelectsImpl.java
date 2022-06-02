package com.onlinecourse.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecourse.app.Exception.UserSelectsNotFoundException;

import com.onlinecourse.app.entities.UserSelects;
import com.onlinecourse.app.repositories.UserSelectsRepository;

@Service
public class UserSelectsImpl implements UserSelectsService{
		
	
	@Autowired
	private UserSelectsRepository userSelectsRepository;
	@Override
	public List<UserSelects> getUselects() {
		// TODO Auto-generated method stub
		return this.userSelectsRepository.findAll();
	}

	@Override
	public UserSelects getUselect(String UId) throws UserSelectsNotFoundException {
		// TODO Auto-generated method stub
		Optional<UserSelects>optionalUser= this.userSelectsRepository.findById(UId);
		if(optionalUser.isEmpty())throw new UserSelectsNotFoundException("User Not found");
		return optionalUser.get();
	}

	@Override
	public UserSelects addUselect(UserSelects uselect) {
		// TODO Auto-generated method stub
		return this.userSelectsRepository.save(uselect);
	}

	@Override
	public UserSelects updateUselect(UserSelects uselect) {
		// TODO Auto-generated method stub
		return this.userSelectsRepository.save(uselect);
	}

	@Override
	public void deleteUSelects(String UId) {
		// TODO Auto-generated method stub
		this.userSelectsRepository.deleteById(UId);
	}
			
	
	
}
