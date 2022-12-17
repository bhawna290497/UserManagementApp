package com.app.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.UserManagementApp.entities.UserAccountEntity;



@Repository
public interface UserRepository extends JpaRepository<UserAccountEntity, Integer>{

}
