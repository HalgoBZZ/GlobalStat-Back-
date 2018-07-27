package com.pfe.stats.pfe.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.pfe.stats.pfe.entities.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, String>{


	public Account findByLogin(String login);
	
	public Account findByPwd(String pwd);
	
	@Query("{'login':'?0','pwd':'?1'}")
	public Account connexion(String login, String pwd);

}
