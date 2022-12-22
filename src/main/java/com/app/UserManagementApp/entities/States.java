package com.app.UserManagementApp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "STATE_MASTER")
@Getter
@Setter
public class States {

	@Id
	@Column(name = "STATE_ID")
	private int stateId;
	
	@Column(name = "STATE_NAME")
	private String stateName;
	
	@Column(name = "COUNTRY_ID")
	private int countryId;
	
	
}
