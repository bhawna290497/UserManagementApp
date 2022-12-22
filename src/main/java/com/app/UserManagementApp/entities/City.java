package com.app.UserManagementApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
