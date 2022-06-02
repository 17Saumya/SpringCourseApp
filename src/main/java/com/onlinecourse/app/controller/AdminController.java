package com.onlinecourse.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinecourse.app.Exception.AdminNotFoundException;
import com.onlinecourse.app.entities.Admin;
import com.onlinecourse.app.services.AdminService;


@RestController
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	//to get admins
	@GetMapping("/admins")
	public List<Admin> getAdmins(){
			return this.adminService.getAdmins();
		}
	//to get single admin
	@GetMapping("/admin/{adminId}")
	public Admin getAdmin(@PathVariable String adminId) throws AdminNotFoundException
	{
		return this.adminService.getAdmin((adminId));
	}
	//add admin
	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody Admin Admin) 
	{
		return this.adminService.addAdmin(Admin);
	}
	//update admin using PUT method
	@PutMapping("/admin")
	public Admin updateAdmin(@RequestBody Admin Admin)
	{
		return this.adminService.updateAdmin(Admin);
	}
	
	//Delete Admin
	@DeleteMapping("/admin/{adminId}")
	public ResponseEntity<HttpStatus> deleteAdmin(@PathVariable String adminId){
		try {
			this.adminService.deleteAdmin((adminId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception a) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}
