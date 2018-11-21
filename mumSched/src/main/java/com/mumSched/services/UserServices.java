package com.mumSched.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.mumSched.model.UserProfile;
import com.mumSched.repository.UserRepository;
@Service
@Transactional
public class UserServices {
	
	private final UserRepository userRepository;
	
	
	public UserServices(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	public void saveMyUser(UserProfile user) {
		userRepository.save(user);
	}
	
	public List<UserProfile>showAllUser(){
		List <UserProfile> users = new ArrayList<UserProfile>();
		
		for (UserProfile user: userRepository.findAll()) {
			users.add(user);
		}
		return users;
	}
	
	public boolean LoginUser(String username, String password) {
		for (UserProfile user: userRepository.findAll()) {
			if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public void deleteuser(int id) {
		userRepository.delete(id);
	}
	
	public UserProfile editUser(int id) {
		return userRepository.findOne(id).orElse(null);
	}


	public UserProfile LoggedInUser() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
