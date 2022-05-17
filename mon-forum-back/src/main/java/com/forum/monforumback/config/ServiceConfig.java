package com.forum.monforumback.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.forum.monforumback.repositories.MessageRepository;
import com.forum.monforumback.repositories.SujetRepository;
import com.forum.monforumback.services.*;


@Configuration
public class ServiceConfig {
	/*
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}*/
	 
	@Bean
	public MessageService MessageService(MessageRepository repository) {
	    return new MessageService(repository);
	}
	
	@Bean
	public SujetService SujetService(SujetRepository repository) {
	    return new SujetService(repository);
	}

}
