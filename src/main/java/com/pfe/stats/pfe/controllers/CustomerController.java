package com.pfe.stats.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.stats.pfe.entities.Customer;
import com.pfe.stats.pfe.services.CustomerService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/add")
	public void add(@RequestBody Customer customer) {
		service.add(customer);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Customer customer) {
		service.update(customer);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void delete(@PathVariable("cin")String id) {
		service.delete(id);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Customer customer) {
		service.delete(customer);
	}
	
	@GetMapping("/all")
	public List<Customer>getAll(){
		return service.findAll();
	}
	@GetMapping("/byemail/{email}")
	public Customer getOne(@PathVariable("email")String email) {
		return service.getOne(email);
	}
}
