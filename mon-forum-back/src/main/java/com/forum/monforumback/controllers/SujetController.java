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

import com.forum.monforumback.entities.Sujet;
import com.forum.monforumback.services.SujetService;

@RestController
@RequestMapping("sujets")
@CrossOrigin
public class SujetController {
	
	@Autowired
    SujetService service;

    @GetMapping
    public ResponseEntity<List<Sujet>> findAll() {
        return ResponseEntity.ok(this.service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Optional<Sujet> findSujet = this.service.findById(id);

        if(findSujet.isPresent())
        {
            return new ResponseEntity<>(findSujet.get(), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Sujet sujet) {
        Optional<Sujet> findSujet = this.service.create(sujet);

        if(findSujet.isPresent())
        {
            return new ResponseEntity<>(findSujet.get(), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping()
    public ResponseEntity<?> update(@RequestBody Sujet sujet) {
        Optional<Sujet> findSujet = this.service.update(sujet);

        if(findSujet.isPresent())
        {
            return new ResponseEntity<>(findSujet.get(), HttpStatus.OK);
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
