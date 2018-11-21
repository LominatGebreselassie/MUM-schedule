package com.mumSched.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mumSched.model.Section;
import com.mumSched.model.Student;

public interface SectionRepository extends CrudRepository<Section, Long>{

		public List<Student> findStudentById(Long id);
		public List<Section> findByFacultyId(long id);
}
