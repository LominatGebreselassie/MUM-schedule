package com.mumSched.repository;

import org.springframework.data.repository.CrudRepository;

import com.mumSched.model.Faculty;
import com.mumSched.model.UserProfile;

public interface FacultyRepository extends CrudRepository<Faculty, Long>{
	//public Faculty findByUserProfileFirstName(String firstName);
	
	public Faculty findByUserProfile(UserProfile userProfile);
}