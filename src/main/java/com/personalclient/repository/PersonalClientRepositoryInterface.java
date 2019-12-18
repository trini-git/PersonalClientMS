package com.personalclient.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.personalclient.model.PersonalClientModel;

import reactor.core.publisher.Mono;

@Repository
public interface PersonalClientRepositoryInterface extends ReactiveMongoRepository<PersonalClientModel, String>{
	
	@Query("{'document : ?0'}")
	Mono<PersonalClientModel> findByDocument(String document);

}
