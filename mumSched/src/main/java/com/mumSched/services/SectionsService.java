package com.mumSched.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumSched.model.Block;
import com.mumSched.model.Course;
import com.mumSched.model.Section;
import com.mumSched.model.Student;
import com.mumSched.repository.SectionRepository;

@Service 
public class SectionsService {
	@Autowired
	private SectionRepository sectionRepository;
	
	@Autowired
	private BlockService blockService;

	public void saveSection(Section section) {	
		sectionRepository.save(section);
	}

	public List<Section> getAllSection() {
		return (List<Section>) sectionRepository.findAll();
	}

	public Section getSectionById(Long id) {
		return sectionRepository.findOne(id);
	}

	
	public void deleteSection(Long id) {
		sectionRepository.delete(id);
	}

	
	public void updateSection(Section section) {
		sectionRepository.save(section);
		
	}
	
	public Section createSection(Long block_id) {
		Section section = new Section();
		Block block = blockService.getBlockById(block_id);
		section.setBlock(block);
		return section;
	}
	public Section createSection(Long block_id, Course course) {
		Section section = new Section();
		Block block = blockService.getBlockById(block_id);
		section.setCourse(course);
		section.setBlock(block);
		return section;
	}
	
	public List<Student> getStudentBySection(Long id){
		return (List<Student>) sectionRepository.findStudentById(id);
	}
	
	public List<Section> getSectionsForFaculty(long facultyId){
		return sectionRepository.findByFacultyId(facultyId);
	}
}
