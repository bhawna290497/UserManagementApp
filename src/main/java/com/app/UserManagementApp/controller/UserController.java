package com.app.UserManagementApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.UserManagementApp.entities.City;
import com.app.UserManagementApp.entities.Country;
import com.app.UserManagementApp.entities.States;
import com.app.UserManagementApp.model.User;
import com.app.UserManagementApp.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping(value = "/getAllCountry", produces = "application/json")
	public ResponseEntity<List<Country>> getAllCountry() {

		List<Country> allCountries = userServiceI.getAllCountries();

		return new ResponseEntity<List<Country>>(allCountries, HttpStatus.OK);

	}

	@GetMapping(value = "/getAllState/{countryId}", produces = "application/json")
	public ResponseEntity<List<States>> getAllState(@PathVariable int countryId) {

		List<States> allStates = userServiceI.getAllStates(countryId);

		return new ResponseEntity<List<States>>(allStates, HttpStatus.OK);

	}

	@GetMapping(value = "/getAllCity/{stateId}", produces = "application/json")
	public ResponseEntity<List<City>> getAllCity(@PathVariable int stateId) {

		List<City> allCities = userServiceI.getAllCities(stateId);

		return new ResponseEntity<List<City>>(allCities, HttpStatus.OK);

	}
	@PostMapping(value = "/saveUser", consumes = "application/json")
	public ResponseEntity<String> saveUser(@RequestBody User user)
	{
		boolean saveUser=userServiceI.saveUser(user);
		if(saveUser)
		{
			String msg="User saved";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		else
		{
			String m="User not saved";
			return new ResponseEntity<String>(m, HttpStatus.BAD_REQUEST);
		}
	}
}
