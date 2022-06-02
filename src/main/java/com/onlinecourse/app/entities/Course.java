package com.onlinecourse.app.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Course {
	@Id	
	private String  courseId;
	private String title;
	private String description;
	private String price;
	private String noOfLectures;
	private String facultyName;
	private String facultyEmailID;
	private String duration;
	private Date dateOfPurchase;
	private String link;
	public Course(String link,String facultyEmailID,Date dateOfPurchase,String courseId, String title, String description,String price ,String noOfLectures, String facultyname, String duration) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.description = description;
		this.price=price;
		this.noOfLectures=noOfLectures;
		this.facultyName=facultyName;
		this.duration=duration;
		this.dateOfPurchase=dateOfPurchase;
		this.facultyEmailID=facultyEmailID;
		this.link=link;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	 public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getFacultyEmailID() {
		return facultyEmailID;
	}
	public void setFacultyEmailID(String facultyEmailID) {
		this.facultyEmailID = facultyEmailID;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public String getId() { 
		  return courseId; 
		  } 
	 public void setId(String courseId)
	 {
		 this.courseId = courseId;
	 }
	 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public  String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNoOfLectures() {
		return noOfLectures;
	}
	public void setNoOfLectures(String noOfLectures) {
		this.noOfLectures = noOfLectures;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", noOfLectures=" + noOfLectures + ", facultyName=" + facultyName + ", facultyEmailID="
				+ facultyEmailID + ", duration=" + duration + ", dateOfPurchase=" + dateOfPurchase + ", link=" + link
				+ "]";
	}
	
}
