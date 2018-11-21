/*package com.mumSched.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumSched.model.Specialization;
import com.mumSched.repository.SpecializationRepository;


@Service
public class SpecializationsService {

	@Autowired
	SpecializationRepository specalizationRepository;
	
	public Specialization save(Specialization specalization)
	{
		return specalizationRepository.save(specalization);
	}
	
	public List<Specialization> findAllspecalization()
	{
		return (List<Specialization>) specalizationRepository.findAll();
	}
	public void deleteSpecialization(Long id){
		specalizationRepository.delete(id);
	}
	public Specialization getSpecialization(Long id){
		return specalizationRepository.findOne(id);
	}
}
*/