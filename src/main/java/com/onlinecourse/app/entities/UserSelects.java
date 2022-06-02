package com.onlinecourse.app.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserSelects {
	@Id	
	private String  userid;
	private String  courseid;
	
	//private String  StudentName;
	private String coursetitle;
	private String coursedescription;
	private String facultyname;
	private String courseduration;
	private String dateOfPurchase;
	private String price;
	public UserSelects(String courseid, String userid, String coursetitle, String coursedescription, String facultyname,
			String courseduration, String dateOfPurchase, String price) {
		super();
		this.courseid = courseid;
		this.userid = userid;
		this.coursetitle = coursetitle;
		this.coursedescription = coursedescription;
		this.facultyname = facultyname;
		this.courseduration = courseduration;
		this.dateOfPurchase = dateOfPurchase;
		this.price = price;
	}
	public UserSelects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCoursetitle() {
		return coursetitle;
	}
	public void setCoursetitle(String coursetitle) {
		this.coursetitle = coursetitle;
	}
	public String getCoursedescription() {
		return coursedescription;
	}
	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}
	public String getFacultyname() {
		return facultyname;
	}
	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	public String getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "UserSelects [courseid=" + courseid + ", userid=" + userid + ", coursetitle=" + coursetitle
				+ ", coursedescription=" + coursedescription + ", facultyname=" + facultyname + ", courseduration="
				+ courseduration + ", DateOfPurchase=" + dateOfPurchase + ", price=" + price + "]";
	}
	
	
}
