package de.wwi118.webprogramming.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.wwi118.webprogramming.model.Message;
import de.wwi118.webprogramming.repo.MessagesRepo;

@RestController
@RequestMapping(path="messages")
public class MessageApi {
	
	@Autowired
	MessagesRepo repo;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveMessage(@RequestParam String message) {
		Message entity = new Message();
		entity.setText(message);
		repo.save(entity);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Message> getAll() {
		return repo.findAll();
	}

}
