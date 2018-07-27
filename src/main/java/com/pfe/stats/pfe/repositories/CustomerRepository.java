package com.pfe.stats.pfe.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pfe.stats.pfe.entities.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{
	
	public Customer getByEmail(String email);

}
