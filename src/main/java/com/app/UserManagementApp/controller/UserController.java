package com.app.UserManagementApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.UserManagementApp.model.User;
import com.app.UserManagementApp.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
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
