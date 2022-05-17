package com.forum.monforumback.services;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.forum.monforumback.entities.Sujet;
import com.forum.monforumback.repositories.SujetRepository;

public class SujetService {
	
	SujetRepository repository;
	
	 public SujetService(SujetRepository repository) {
		 this.repository = repository;
	 }
	 
	 public List<Sujet> findAll() {
	        List<Sujet> utilisateurs = this.repository.findAll();
	        return utilisateurs;
	 }
	 
	 public Optional<Sujet> findById(String id) {
	 	if(this.repository.findById(id).get() != null)
		{
	    	return Optional.of(this.repository.findById(id).get()) ;
		}else {
	    	return Optional.empty();
	    }
	 }
		 	    
	public Optional<Sujet> create(Sujet sujet) {
		if(sujet.getIdSujet() != null)
		{
			return Optional.empty();
		}else {
			sujet.setCreatedDateSujet(LocalDateTime.now());
			sujet.setUpdateDateSujet(LocalDateTime.now());
	    	return Optional.of(this.repository.insert(sujet));
	    }
	}
	
	
	public Optional<Sujet> update(Sujet sujet) {
		if(this.repository.findById(sujet.getIdSujet()).get() != null)
		{								
			sujet.setUpdateDateSujet(LocalDateTime.now());			
			
	    	return Optional.of(this.repository.save(sujet));
		}else {
	    	return Optional.empty();
	    }
	}
	
	
	public void deleteById(String id) {
	    	this.repository.deleteById(id) ;
	}

}
