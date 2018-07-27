package com.pfe.stats.pfe.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.stats.pfe.entities.Module;
import com.pfe.stats.pfe.repositories.ModuleRepository;
import com.pfe.stats.pfe.services.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService{
	
	@Autowired
	private ModuleRepository repository;

	@Override
	public void add(Module module) {
		repository.save(module);
		
	}

	@Override
	public void update(Module module) {
		repository.save(module);
		
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
		
	}


	@Override
	public List<Module> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(Module module) {
		repository.delete(module);
		
	}

	@Override
	public Module findOne(String value) {
		return repository.findByValueModule(value);
	}

}
