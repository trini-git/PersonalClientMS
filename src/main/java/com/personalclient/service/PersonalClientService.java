package com.personalclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalclient.model.PersonalClientModel;
import com.personalclient.repository.PersonalClientRepositoryInterface;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonalClientService implements PersonalClientServiceInterface{

	@Autowired
	PersonalClientRepositoryInterface personalClientRepository;
	
	@Override
	public Flux<PersonalClientModel> getAll() {
		
		return personalClientRepository.findAll();
	}

	@Override
	public Mono<PersonalClientModel> getById(String id) {
		
		return personalClientRepository.findById(id);
	}

	@Override
	public Mono<PersonalClientModel> insertPersonalClient(PersonalClientModel personalClientModel) {
		
		return personalClientRepository.save(personalClientModel);
	}

	@Override
	public Mono<Void> deletePersonalClient(String id) {
		
		return personalClientRepository.deleteById(id);
	}

	@Override
	public Mono<PersonalClientModel> updatePersonalClient(PersonalClientModel personalClientModel) {
		
		return personalClientRepository.save(personalClientModel);
	}
		
}
