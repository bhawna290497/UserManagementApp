package com.app.UserManagementApp.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.UserManagementApp.entities.Country;
import com.app.UserManagementApp.entities.UserAccountEntity;
import com.app.UserManagementApp.model.User;
import com.app.UserManagementApp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveUser(User user) {
		
		user.setAccStatus("LOCKED");
		user.setPassword(generateRondomPassword());
		
		UserAccountEntity userAccountEntity=new UserAccountEntity();
		BeanUtils.copyProperties(user, userAccountEntity);
		
		UserAccountEntity accountEntity = userRepository.save(userAccountEntity);
		if(accountEntity!=null)
		{
			return true;
		}
		else
			return false;
	}
	private String generateRondomPassword()
	{
		return null;
	}
}
