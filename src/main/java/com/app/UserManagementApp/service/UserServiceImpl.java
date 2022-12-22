package com.app.UserManagementApp.service;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.UserManagementApp.entities.City;
import com.app.UserManagementApp.entities.Country;
import com.app.UserManagementApp.entities.States;
import com.app.UserManagementApp.entities.UserAccountEntity;
import com.app.UserManagementApp.model.Login;
import com.app.UserManagementApp.model.UnlockAccount;
import com.app.UserManagementApp.model.User;
import com.app.UserManagementApp.repositories.CityRepository;
import com.app.UserManagementApp.repositories.CountryRepository;
import com.app.UserManagementApp.repositories.StateRepository;
import com.app.UserManagementApp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Country> getAllCountries() {
		List<Country> findAll = countryRepository.findAll();
		return findAll;
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
		String alphabetic = RandomStringUtils.randomAlphabetic(6);
		return alphabetic;
	}

	@Override
	public List<States> getAllStates(int conutryId) {
		List<States> findAll = stateRepository.findByCountryId(conutryId);
		return findAll;
	}

	@Override
	public List<City> getAllCities(int stateId) {
		List<City> findAll = cityRepository.findByStateId(stateId);
		return findAll;
	}

	@Override
	public boolean unlockAccount(UnlockAccount unlockAccount) {
		String email = unlockAccount.getEmail();
		String tempPassword = unlockAccount.getTempPassword();
		
		UserAccountEntity user = userRepository.findByEmailAndPassword(email, tempPassword);
		if(user !=null)
		{
			user.setAccStatus("UNLOCKED");
			user.setPassword(unlockAccount.getNewPassword());
			userRepository.save(user);
			return true;
		}
		else
			return false;
	}

	@Override
	public String loginCheck(Login login) {
		
		String email = login.getEmail();
		String password = login.getPassword();
		
		UserAccountEntity userAccountEntity = userRepository.findByEmailAndPassword(email, password);
		
		if(userAccountEntity!=null)
		{
			if(userAccountEntity.getAccStatus().equals("LOCKED"))
				return "Your Account is locked";
			else
				return "Login Success";
		}
		else
			return "Invalid User Creditionals";
	}

	@Override
	public String forgetPassword(String email) {
		UserAccountEntity byEmail = userRepository.findByEmail(email);
		if(byEmail!=null)
		{
			return "Mail send to your registerd mail id";
		}
		else
		return "User is not found";
	}
}
