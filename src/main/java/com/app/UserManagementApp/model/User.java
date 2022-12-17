package com.app.UserManagementApp.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	private String fname;
	private String lname;
	private String email;
	private long phone;
	private Date dob;
	private String gender;
	private String country;
	private String state;
	private String city;
	private String password;
	private String accStatus;
}
