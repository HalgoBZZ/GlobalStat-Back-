package com.pfe.stats.pfe.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="account")
public class Account {
	
	@Id
	@Field("id")
	private String idAccount;
	
	@Field("login")
	@Indexed(unique = true)
	private String login;
	
	@Field("pwd")
	private String pwd;
	

	public Account() {
		
	}

	public Account(String login, String pwd) {
		this.login = login;
		this.pwd = pwd;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	
	
	
	
}
