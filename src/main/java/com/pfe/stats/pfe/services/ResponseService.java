package com.pfe.stats.pfe.services;

import java.util.List;

import com.pfe.stats.pfe.entities.Response;

public interface ResponseService {
	
	public void add(Response response);
	
	public void update(Response response);
	
	public void delete(String id);
	
	public List<Response> findAll();
	
	public Response findOne(String value);
	
	public void delete(Response response);

}
