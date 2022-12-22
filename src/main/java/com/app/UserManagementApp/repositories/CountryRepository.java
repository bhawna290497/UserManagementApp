package com.app.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.UserManagementApp.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
