package com.java.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topic;

	@RequestMapping("/topic")
	public List<Topic> getAllTopic() {
		return topic.getAllTopic();
	}

	@RequestMapping("/topic/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topic.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topic")
	public String addTopic(@RequestBody Topic dl) {
		topic.addTopic(dl);
		return "topic added";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
	public String updateTopic(@RequestBody Topic dl) {
		topic.updateTopic(dl);
		return "topic updated";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
	public String deleteTopic(@PathVariable String id) {
		topic.deleteTopic(id);
		return "topic deleted";
	}
}
