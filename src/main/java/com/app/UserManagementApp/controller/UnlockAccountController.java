package com.app.UserManagementApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.UserManagementApp.model.UnlockAccount;
import com.app.UserManagementApp.service.UserServiceI;

@RestController
public class UnlockAccountController {

	@Autowired
	private UserServiceI userServiceI;
	
	@PutMapping("/unlock")
	public ResponseEntity<String> unlockAcc(@RequestBody UnlockAccount unlockAccount)
	{
		boolean unlockAccount2 = userServiceI.unlockAccount(unlockAccount);
		if(unlockAccount2)
			return new ResponseEntity<String>("Account unlock success", HttpStatus.OK);
		else
			return new ResponseEntity<String>("Account is not unlock", HttpStatus.BAD_REQUEST);
	}
}
