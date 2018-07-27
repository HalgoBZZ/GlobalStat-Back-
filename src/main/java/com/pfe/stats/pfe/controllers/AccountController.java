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

import com.pfe.stats.pfe.entities.Account;
import com.pfe.stats.pfe.services.AccountService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/accounts")
public class AccountController {

	
	@Autowired
	private AccountService service;
	
	@PostMapping("/add")
	public void add(@RequestBody Account account) {
		service.add(account);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Account account) {
		service.update(account);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void delete(@PathVariable("id") String id) {
		service.delete(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@RequestBody Account account) {
		service.delete(account);
	}	
	
	@GetMapping("/all")
	public List<Account>getAll(){
		return service.findAll();
	}
	
	@GetMapping("/getByLogin/{login}")
	public Account getByLogin(@PathVariable("login") String login) {
		return service.findOne(login);
		}
	
	@GetMapping("/connexion/{login}/{pwd}")
	public Account connexion(@PathVariable("login") String login, @PathVariable("pwd") String pwd) {
		return service.authentication(login, pwd);
	}
	
}
