package com.pfe.stats.pfe.services;

import java.util.List;

import com.pfe.stats.pfe.entities.Account;

public interface AccountService {
	
	public void add(Account account);
	
	public void update(Account account);
	
	public void delete(String id);
	
	public List<Account> findAll();
	
	public void delete(Account account);

	public Account findOne(String login);
	
	public Account authentication(String login, String pwd);
}
