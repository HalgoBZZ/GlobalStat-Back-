package com.pfe.stats.pfe.services;

import java.util.List;

import com.pfe.stats.pfe.entities.Module;
import com.pfe.stats.pfe.entities.Question;

public interface QuestionService {
	
	public void add(Question question);
	
	public void update(Question question);
	
	public void delete(String id);
	
	public List<Question> findAll();
	
	public List<Question> findByModule(Module module);

	public void delete(Question question);
}
