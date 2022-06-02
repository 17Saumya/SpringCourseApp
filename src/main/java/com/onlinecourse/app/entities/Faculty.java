package com.onlinecourse.app.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Faculty {
	@Id
	private String  id;
	private String facultyname;
	private String department;
	
	public Faculty(String id, String facultyname, String department) {
		super();
		this.id = id;
		this.facultyname = facultyname;
		this.department = department;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return facultyname;
	}
	public void setName(String facultyname) {
		this.facultyname = facultyname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + facultyname + ", department=" + department + "]";
	}
}
