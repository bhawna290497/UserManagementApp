package com.app.UserManagementApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.UserManagementApp.entities.States;

@Repository
public interface StateRepository extends JpaRepository<States, Integer> {

	public List<States> findByCountryId(int countryId);
}
