package com.java.course;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course, String> {

	public Optional<Course> findByDescription(String desc);
	
}
