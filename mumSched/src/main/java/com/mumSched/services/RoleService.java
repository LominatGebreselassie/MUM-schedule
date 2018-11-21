/*package com.mumSched.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumSched.model.Role;
import com.mumSched.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository userTypeRepository;
	
	public Role save(Role userType)
	{
		return userTypeRepository.save(userType);
	}
	public List<Role> getAll()
	{
		return (List<Role>) (userTypeRepository.findAll());
	}
	public Role findOne(Long id)
	{
		return userTypeRepository.findOne(id);
	}
	
	public void deleteRole(Long id){
		userTypeRepository.delete(id);
	}

}
*/