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

import com.pfe.stats.pfe.entities.Response;
import com.pfe.stats.pfe.services.ResponseService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/responses")
public class ResponseController {

	@Autowired
	private ResponseService service;
	
	@PostMapping("/add")
	public void add(@RequestBody Response response) {
		service.add(response);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Response response) {
		service.update(response);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void delete(@PathVariable("id") String id) {
		service.delete(id);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Response response) {
		service.delete(response);
	}
	
	@GetMapping("/all")
	public List<Response>getAll(){
		return service.findAll();
	}
	
	@GetMapping("/byvalue/{value}")
	public Response getByValue(@PathVariable("value") String value) {
		return service.findOne(value);
	}
}
