package com.java.course;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {

	@Autowired
	CourseService course;

	@RequestMapping("/topic/{topicid}/course")
	public List<Course> getAllTopic() {
		return course.getAllCourse();
	}


	/*@RequestMapping("/topic/{topicid}/course/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		return course.getCourse(id);
	}*/
	
	@RequestMapping("/topic/{topicid}/course/{desc}")
	public Optional<Course> findByDesc(@PathVariable String desc) {
		return course.findbydesc(desc);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topic/{topicid}/course")
	public String addCourse(@RequestBody Course dl) {
		course.addCourse(dl);
		return "course added";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topic/{topicid}/course/{id}")
	public String updateCourse(@RequestBody Course dl) {
		course.updateCourse(dl);
		return "course updated";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topic/{topicid}/course/{id}")
	public String deleteCourse(@PathVariable String id) {
		course.deleteCourse(id);
		return "course deleted";
	}
}
