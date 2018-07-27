package com.pfe.stats.pfe.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.stats.pfe.entities.Account;
import com.pfe.stats.pfe.repositories.AccountRepository;
import com.pfe.stats.pfe.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository repository;
	
	@Override
	public void add(Account account) {
		repository.save(account);
		
	}

	@Override
	public void update(Account account) {
		repository.save(account);
		
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Account> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(Account account) {
		repository.delete(account);
	}

	@Override
	public Account findOne(String login) {
		return repository.findByLogin(login);
	}

	
	@Override
	public Account authentication(String login, String pwd) {
		return repository.connexion(login, pwd);
	}

	
}
