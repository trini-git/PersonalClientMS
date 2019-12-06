package com.personalclient.service;

import com.personalclient.model.PersonalClientModel;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalClientServiceInterface {

	//we need to create our own methods
	
	Flux<PersonalClientModel> getAll();
	Mono<PersonalClientModel> getById(String id);
	Mono<PersonalClientModel> insertPersonalClient(PersonalClientModel personalClientModel);
		
}
