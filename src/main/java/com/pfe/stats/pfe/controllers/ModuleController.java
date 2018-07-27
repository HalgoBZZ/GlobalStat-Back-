package com.pfe.stats.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.stats.pfe.entities.Module;
import com.pfe.stats.pfe.services.ModuleService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/modules")
public class ModuleController {

	@Autowired
	private ModuleService service;
	
	@PostMapping("/add")
	public void add(@RequestBody Module module) {
		service.add(module);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Module module) {
		service.update(module);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void delete(@PathVariable("id") String id) {
		service.delete(id);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Module module) {
		service.delete(module);
	}
	
	@GetMapping("/all")
	public List<Module>getAll(){
		return service.findAll();
	}
}
