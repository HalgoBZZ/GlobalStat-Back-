package com.pfe.stats.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.stats.pfe.entities.Question;
import com.pfe.stats.pfe.services.ModuleService;
import com.pfe.stats.pfe.services.QuestionService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/questions")
public class QuestionController {

	@Autowired
	private QuestionService service;
	@Autowired
	private ModuleService moduleService;
	
	@PostMapping("/accueil/add")
	public void addAccueil(@RequestBody Question question) {
		question.setModule(moduleService.findOne("Accueil"));
		service.add(question);
	}
	
	@PostMapping("/nouveautes/add")
	public void addNouveautes(@RequestBody Question question) {
		question.setModule(moduleService.findOne("Nouveautés"));
		service.add(question);
	}
	
	@PostMapping("/debit/add")
	public void addDebit(@RequestBody Question question) {
		question.setModule(moduleService.findOne("Débit"));
		service.add(question);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Question question) {
		service.update(question);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void delete(@PathVariable("id") String id) {
		service.delete(id);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Question question) {
		service.delete(question);
	}
	
	@GetMapping("/all")
	public List<Question>getAll(){
		return service.findAll();
	}
	
	@GetMapping("/accueil/all")
	public List<Question>getAllAccueil(){
		return service.findByModule(moduleService.findOne("Accueil"));
	}
	
	@GetMapping("/debit/all")
	public List<Question>getAllDebit(){
		return service.findByModule(moduleService.findOne("Débit"));
	}
	
	@GetMapping("/nouveautes/all")
	public List<Question>getAllNouveautes(){
		return service.findByModule(moduleService.findOne("Nouveautés"));
	}
}
