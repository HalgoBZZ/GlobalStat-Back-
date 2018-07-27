package com.pfe.stats.pfe.services;

import java.util.List;

import com.pfe.stats.pfe.entities.Module;

public interface ModuleService {
	
	public void add(Module module);
	
	public void update(Module module);
	
	public void delete(String id);
	
	public List<Module> findAll();
	
	public void delete(Module module);
	
	public Module findOne(String value);

}
