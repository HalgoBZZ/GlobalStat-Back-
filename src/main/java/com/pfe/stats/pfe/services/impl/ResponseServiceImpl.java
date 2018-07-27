package com.pfe.stats.pfe.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.stats.pfe.entities.Response;
import com.pfe.stats.pfe.repositories.ResponseRepository;
import com.pfe.stats.pfe.services.ResponseService;

@Service
public class ResponseServiceImpl implements ResponseService{
	
	@Autowired
	private ResponseRepository repository;

	@Override
	public void add(Response response) {
		repository.save(response);
		
	}

	@Override
	public void update(Response response) {
		repository.save(response);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

	@Override
	public List<Response> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(Response response) {
		repository.delete(response);
		
	}

	@Override
	public Response findOne(String value) {
		return repository.findByValueResponse(value);
	}

}
