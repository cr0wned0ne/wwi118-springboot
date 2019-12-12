package de.wwi118.webprogramming.repo;

import org.springframework.data.repository.CrudRepository;

import de.wwi118.webprogramming.model.Message;

public interface MessagesRepo extends CrudRepository<Message, Long>{

}
