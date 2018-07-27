package com.pfe.stats.pfe.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Document(collection = "response")
public class Response {
	
	@Id
	@Field("id")
	private String idResponse;
	
	@Field("value")
	private String valueResponse;
	
	@Field("question")
	
	@DBRef
	private Question question;

	public Response() {
		
	}

	public Response(String valueResponse) {
		this.valueResponse = valueResponse;
	}

	public String getIdResponse() {
		return idResponse;
	}

	public void setIdResponse(String idResponse) {
		this.idResponse = idResponse;
	}

	public String getValueResponse() {
		return valueResponse;
	}

	public void setValueResponse(String valueResponse) {
		this.valueResponse = valueResponse;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
