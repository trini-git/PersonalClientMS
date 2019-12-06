package com.personalclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.personalclient.model.PersonalClientModel;
import com.personalclient.service.PersonalClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/personal-client")
public class PersonalClientController {
	
	@Autowired
	PersonalClientService personalClientService;
	
	@GetMapping("/all")
	public Flux<PersonalClientModel> getAll(){
		
		return personalClientService.getAll();
		
	}
	
	@GetMapping("/{id}")
	public Mono<PersonalClientModel> getById(@PathVariable String id){
		
		return personalClientService.getById(id);
	}
	
	@PostMapping
	public Mono<PersonalClientModel> insertPersonalClient (@RequestBody PersonalClientModel personalClientModel) {
		
		return personalClientService.insertPersonalClient(personalClientModel);
		
	}
	
}
