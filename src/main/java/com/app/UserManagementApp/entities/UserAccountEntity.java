package com.app.UserManagementApp.entities;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USER_MASTER")
@Getter
@Setter
public class UserAccountEntity {

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name = "FIRST_NAME")
	private String fname;
	
	@Column(name = "LAST_NAME")
	private String lname;
	
	@Column(name = "USER_EMAIL")
	private String email;
	
	@Column(name = "USER_PHONENO")
	private long phone;
	
	@Column(name = "DATE_OF_BIRTH")
	private Date dob;
	
	@Column(name = "USER_GENDER")
	private String gender;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "USER_STATUS")
	private String accStatus;
	
	@CreationTimestamp
	@Column(name = "CREATED_DATE", updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name = "UPDATED_DATE",insertable = false)
	private LocalDate updateDate;
	
}
