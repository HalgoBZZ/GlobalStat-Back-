package com.pfe.stats.pfe.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.stats.pfe.entities.Module;
import com.pfe.stats.pfe.entities.Question;
import com.pfe.stats.pfe.repositories.QuestionRepository;
import com.pfe.stats.pfe.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository repository;
	
	@Override
	public void add(Question question) {
		repository.save(question);
	}

	@Override
	public void update(Question question) {
		repository.save(question);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}

	@Override
	public List<Question> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(Question question) {
		repository.delete(question);
		
	}

	@Override
	public List<Question> findByModule(Module module) {
		return repository.findByModule(module);
	}

}
