package com.personalclient.service;

import com.personalclient.model.PersonalClientModel;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalClientServiceInterface {

	//we need to create our own methods
	
	Flux<PersonalClientModel> getAll();
	Mono<PersonalClientModel> getById(String id);
	Mono<PersonalClientModel> insertPersonalClient(PersonalClientModel personalClientModel);
	Mono<PersonalClientModel> deletePersonalClient(PersonalClientModel personalClientModel, String id);
	Mono<PersonalClientModel> updatePersonalClient(PersonalClientModel personalClientModel, String id);
	
	//my own methods
	Mono<PersonalClientModel> findByDocument(String document);
}
