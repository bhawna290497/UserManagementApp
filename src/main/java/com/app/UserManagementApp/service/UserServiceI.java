package com.app.UserManagementApp.service;

import java.util.List;

import com.app.UserManagementApp.entities.City;
import com.app.UserManagementApp.entities.Country;
import com.app.UserManagementApp.entities.States;
import com.app.UserManagementApp.model.Login;
import com.app.UserManagementApp.model.UnlockAccount;
import com.app.UserManagementApp.model.User;

public interface UserServiceI {

	public List<Country> getAllCountries();
	public List<States> getAllStates(int conutryId);
	public List<City> getAllCities(int stateId);
	public boolean saveUser(User user); 
	public String loginCheck(Login login);
	public boolean unlockAccount(UnlockAccount unlockAccount);
	public String forgetPassword(String email);
}
