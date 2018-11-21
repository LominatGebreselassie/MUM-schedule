/*package com.mumSched.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumSched.model.Admin;
import com.mumSched.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired 
	AdminRepository adminRepository;
	
	public Admin save(Admin admin){
		return  adminRepository.save(admin);
		
	}
	
	public List<Admin> getAll(){
		
		return (List<Admin>) adminRepository.findAll();
	}
	
     public Admin getAdminById(Long id){
		
		return adminRepository.findOne(id);
	}
}
*/