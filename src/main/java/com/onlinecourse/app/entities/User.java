package com.onlinecourse.app.entities;

//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import org.springframework.validation.annotation.Validated;

@Document
public class User {
		@Id
		private String id;
		private String name;
		private String username; 
		private String emailid;
		private String password;
		private String confirmPassword;
		private String contact;
		private String isloggedin;
		
		public User(String name, String username, String id, String emailid, String password, String confirmPassword,
				String contact, String isloggedin) {
			super();
			this.name = name;
			this.username = username;
			this.id = id;
			this.emailid = emailid;
			this.password = password;
			this.confirmPassword = confirmPassword;
			this.contact = contact;
			this.isloggedin = isloggedin;
		}
		public String getIsloggedin() {
			return isloggedin;
		}
		public void setIsloggedin(String isloggedin) {
			this.isloggedin = isloggedin;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmPassword() {
			return confirmPassword;
		}
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", username=" + username + ", id=" + id + ", emailid=" + emailid
					+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", contact=" + contact
					+ ", isloggedin=" + isloggedin + "]";
		}
		
		
		
		
}


