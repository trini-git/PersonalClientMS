package com.personalclient.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.personalclient.model.PersonalClientModel;

@Repository
public interface PersonalClientRepositoryInterface extends ReactiveMongoRepository<PersonalClientModel, String>{

}
