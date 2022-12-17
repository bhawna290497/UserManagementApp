package com.app.UserManagementApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
