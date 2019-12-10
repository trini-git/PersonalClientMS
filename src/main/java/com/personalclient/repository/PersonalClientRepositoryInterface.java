package com.personalclient.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.personalclient.model.PersonalClientModel;

import reactor.core.publisher.Mono;

@Repository
public interface PersonalClientRepositoryInterface extends ReactiveMongoRepository<PersonalClientModel, String>{
	
	Mono<PersonalClientModel> findByDocument(String document);

}
