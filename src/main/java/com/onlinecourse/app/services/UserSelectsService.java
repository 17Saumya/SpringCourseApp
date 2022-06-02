package com.onlinecourse.app.services;

import java.util.List;

import com.onlinecourse.app.Exception.UserSelectsNotFoundException;
import com.onlinecourse.app.entities.UserSelects;



public interface UserSelectsService {
				
public List<UserSelects> getUselects();
	
	public UserSelects getUselect(String UId) throws UserSelectsNotFoundException;

	public UserSelects addUselect(UserSelects uselect);
	
	public UserSelects updateUselect(UserSelects uselect);
	
	public void deleteUSelects(String UId);
	
}
