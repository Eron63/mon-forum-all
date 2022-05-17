package com.forum.monforumback.entities;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sujet {
	
	@Id
    private String idSujet;
	
	private String tilteSujet;
	
	private int likesSujet;	
	
	private LocalDateTime createdDateSujet;
	
	private LocalDateTime updateDateSujet;		
	
	@DBRef
	private List<Message> messagesSujet;

}
