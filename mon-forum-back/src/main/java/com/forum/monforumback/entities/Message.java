package com.forum.monforumback.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
	
	@Id
    private String idMessage;
	
	private String contentMessage;
	
	private int likesMessage;	
	
	private LocalDateTime createdDateMessage;
	
	private LocalDateTime updateDateMessage;
	
	private String idSujet;

}
