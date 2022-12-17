package com.app.UserManagementApp.service;

import java.util.List;

import com.app.UserManagementApp.entities.Country;
import com.app.UserManagementApp.model.User;

public interface UserServiceI {

	public List<Country> getAllCountries();
	 
	public boolean saveUser(User user);
	//public void loginCheck(Login);
}
