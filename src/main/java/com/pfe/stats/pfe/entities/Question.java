package com.pfe.stats.pfe.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="question")
public class Question {
	
	@Id
	@Field("id")
	private String idQuest;
	
	@Field("value")
	private String valueQuest;
	
	@Field("module")
	private Module module;
	
	@DBRef
	private List<Response>responses=new ArrayList<Response>();
	
	@DBRef
	private List<Customer> customers=new ArrayList<Customer>();
	

	public Question() {
		
	}

	public Question(String idQuest, String valueQuest) {
		this.idQuest = idQuest;
		this.valueQuest = valueQuest;
	}

	public String getIdQuest() {
		return idQuest;
	}

	public void setIdQuest(String idQuest) {
		this.idQuest = idQuest;
	}

	public String getValueQuest() {
		return valueQuest;
	}

	public void setValueQuest(String valueQuest) {
		this.valueQuest = valueQuest;
	}

	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	

}
