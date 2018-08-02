package com.pfe.stats.pfe.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="module")
public class Module {
	
	@Id
	@Field("id")
	private String idModule;
	
	@Field("value")
	private String valueModule;
	
	@Field("nbusers")
	private int nbusers;
	
	@DBRef
	private List<Question>questions=new ArrayList<Question>();
	
	public Module() {}

	public Module(String valueModule, int nbusers) {
		this.valueModule = valueModule;
		this.nbusers=nbusers;
	}

	public int getNbusers() {
		return nbusers;
	}

	public void setNbusers(int nbusers) {
		this.nbusers = nbusers;
	}

	public String getIdModule() {
		return idModule;
	}

	public void setIdModule(String idModule) {
		this.idModule = idModule;
	}

	public String getValueModule() {
		return valueModule;
	}

	public void setValueModule(String valueModule) {
		this.valueModule = valueModule;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	

}
