package com.forum.monforumback.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.forum.monforumback.entities.Sujet;

public interface SujetRepository extends MongoRepository<Sujet, String>{

}
