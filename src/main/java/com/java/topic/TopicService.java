package com.java.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepo rp;

	public List<Topic> getAllTopic() {
		List<Topic> al = new ArrayList<>();
		rp.findAll().forEach(al::add);
		return al;
	}

	public Optional<Topic> getTopic(String id) {
		return rp.findById(id);
	}

	public void addTopic(Topic dl) {
		rp.save(dl);

	}

	public void updateTopic(Topic dl) {
		// dont need an id
		rp.save(dl);

	}

	public void deleteTopic(String id) {
		rp.deleteById(id);
	}

}
