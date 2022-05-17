package com.forum.monforumback.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.forum.monforumback.entities.Message;

public interface MessageRepository extends MongoRepository<Message, String>{

}
