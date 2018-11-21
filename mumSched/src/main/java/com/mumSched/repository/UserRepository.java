package com.mumSched.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mumSched.model.UserProfile;

public interface UserRepository extends CrudRepository<UserProfile, Integer>{

	

}
