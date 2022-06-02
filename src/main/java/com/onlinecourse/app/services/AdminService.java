package com.onlinecourse.app.services;

import java.util.List;

import com.onlinecourse.app.Exception.AdminNotFoundException;
import com.onlinecourse.app.entities.Admin;



public interface AdminService {

	public List<Admin> getAdmins();
	
	public Admin getAdmin(String adminId) throws AdminNotFoundException;

	public Admin addAdmin(Admin Admin);
	
	public Admin updateAdmin(Admin Admin);
	
	public void deleteAdmin(String adminId);
	
}
