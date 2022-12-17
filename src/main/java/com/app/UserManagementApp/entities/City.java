package com.app.UserManagementApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CITY_MASTER")
@Getter
@Setter
public class City {

	@Id
	@Column(name = "CITY_ID")
	private int cityId;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name = "STATE_ID")
	private int stateId;
}
