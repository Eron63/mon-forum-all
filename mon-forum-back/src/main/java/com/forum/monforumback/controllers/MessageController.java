package com.forum.monforumback.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forum.monforumback.entities.Message;
import com.forum.monforumback.services.MessageService;

@RestController
@RequestMapping("messages")
@CrossOrigin
public class MessageController {	

	@Autowired
    MessageService service;

    @GetMapping
    public ResponseEntity<List<Message>> findAll() {
        return ResponseEntity.ok(this.service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Optional<Message> findMessage = this.service.findById(id);

        if(findMessage.isPresent())
        {
            return new ResponseEntity<>(findMessage.get(), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Message message) {
        Optional<Message> findMessage = this.service.create(message);

        if(findMessage.isPresent())
        {
            return new ResponseEntity<>(findMessage.get(), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("{id}")
    public ResponseEntity<?> update(@RequestBody Message message) {
        Optional<Message> findMessage = this.service.update(message);

        if(findMessage.isPresent())
        {
            return new ResponseEntity<>(findMessage.get(), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.service.deleteById(id);
    }


}
