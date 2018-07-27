package com.pfe.stats.pfe.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pfe.stats.pfe.entities.Module;

@Repository
public interface ModuleRepository extends MongoRepository<Module, String>{
	
	public Module findByValueModule(String value);

}
