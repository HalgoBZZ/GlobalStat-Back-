package com.pfe.stats.pfe.services;

import java.util.List;

import com.pfe.stats.pfe.entities.Customer;

public interface CustomerService {
	
	public void add(Customer customer);
	
	public void update(Customer customer);
	
	public void delete(String id);
	
	public List<Customer> findAll();
	
	public void delete(Customer customer);
	
	public Customer getOne(String email);

}
