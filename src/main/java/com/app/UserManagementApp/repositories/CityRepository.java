package com.app.UserManagementApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.UserManagementApp.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

	public List<City> findByStateId(int stateId);
}
