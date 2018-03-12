package com.java.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseRepo rp;

	public List<Course> getAllCourse() {
		List<Course> al = new ArrayList<>();
		rp.findAll().forEach(al::add);
		return al;
	}

	public Optional<Course> getCourse(String id) {
		return rp.findById(id);
	}

	public void addCourse(Course dl) {
		rp.save(dl);

	}

	public void updateCourse(Course dl) {
		// dont need an id
		rp.save(dl);

	}

	public void deleteCourse(String id) {
		rp.deleteById(id);
	}
	public Optional<Course> findbydesc(String desc) {
		return rp.findByDescription(desc);
	}

}
