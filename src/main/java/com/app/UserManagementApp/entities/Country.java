package com.app.UserManagementApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COUNTRY_MASTER")
@Getter
@Setter
public class Country {

	@Id
	@Column(name="COUNTRY_ID")
	private int countryId;

	@Column(name="COUNTRY_NAME")
	private String countryname;
}
