package com.pfe.stats.pfe.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.stats.pfe.entities.Customer;
import com.pfe.stats.pfe.repositories.CustomerRepository;
import com.pfe.stats.pfe.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public void add(Customer customer) {
		repository.save(customer);
		
	}

	@Override
	public void update(Customer customer) {
		repository.save(customer);
		
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(Customer customer) {
		repository.delete(customer);
		
	}

	@Override
	public Customer getOne(String email) {
		return repository.getByEmail(email);
	}

}
