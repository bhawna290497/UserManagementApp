package com.app.UserManagementApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.UserManagementApp.service.UserServiceI;

@RestController
public class ForgetPasswordRestController {

	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping("/forgetPassword/{email}")
	public String forgetPass(@PathVariable String email)
	{
		String string = userServiceI.forgetPassword(email);
		return string;
	}
}
