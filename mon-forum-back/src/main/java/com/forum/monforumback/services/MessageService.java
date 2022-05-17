package com.forum.monforumback.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.forum.monforumback.entities.Message;
import com.forum.monforumback.repositories.MessageRepository;

public class MessageService {
	
	MessageRepository repository;
	
	public MessageService(MessageRepository repository) {
		 this.repository = repository;
	 }
	
	public List<Message> findAll() {
        List<Message> utilisateurs = this.repository.findAll();
        return utilisateurs;
	}
 
	public Optional<Message> findById(String id) {
	 	if(this.repository.findById(id).get() != null)
		{
	    	return Optional.of(this.repository.findById(id).get()) ;
		}else {
	    	return Optional.empty();
	    }
	 }
	 

	    
	public Optional<Message> create(Message message) {
		if(message.getIdMessage() != null)
		{
			return Optional.empty();
		}else {
			message.setCreatedDateMessage(LocalDateTime.now());
			message.setUpdateDateMessage(LocalDateTime.now());
	    	return Optional.of(this.repository.insert(message));
	    }
	}
	
	
	public Optional<Message> update(Message message) {
		if(this.repository.findById(message.getIdMessage()) != null)
		{
			message.setUpdateDateMessage(LocalDateTime.now());
	    	return Optional.of(this.repository.save(message));
		}else {
	    	return Optional.empty();
	    }
	}
	
	
	public void deleteById(String id) {
	    	this.repository.deleteById(id) ;
	}

}
