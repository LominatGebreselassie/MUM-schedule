/*package com.mumSched.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumSched.model.Course;
import com.mumSched.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	public Course save(Course course) {
		return courseRepository.save(course);
	}

	public List<Course> getAllCourser() {
		return (List<Course>) courseRepository.findAll();
	}

	public Course getCourseByName(String courseName) {
		return courseRepository.findByCourseName(courseName);
	}
	
	public Course getCourseById(Long id){
		return courseRepository.findOne(id);
	}
}
*/