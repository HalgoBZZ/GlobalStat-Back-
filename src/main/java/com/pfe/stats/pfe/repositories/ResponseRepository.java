package com.pfe.stats.pfe.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pfe.stats.pfe.entities.Response;

@Repository
public interface ResponseRepository extends MongoRepository<Response, String>{
	
	public Response findByValueResponse(String value);

}
