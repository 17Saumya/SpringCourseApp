package com.onlinecourse.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecourse.app.Exception.AdminNotFoundException;
import com.onlinecourse.app.entities.Admin;
import com.onlinecourse.app.repositories.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Admin> getAdmins() {
		return this.adminRepository.findAll();
	}

	@Override
	public Admin getAdmin(String adminId) throws AdminNotFoundException {
		Optional<Admin> optionalAdmin = this.adminRepository.findById(adminId);
		if (optionalAdmin.isEmpty())
			throw new AdminNotFoundException("Admin Not found");
		return optionalAdmin.get();

	}

	@Override
	public Admin addAdmin(Admin admin) {
		return this.adminRepository.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return this.adminRepository.save(admin);
	}

	@Override
	public void deleteAdmin(String adminId) { 
		this.adminRepository.deleteById(adminId);
	}

}
