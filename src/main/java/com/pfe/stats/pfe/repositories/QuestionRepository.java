package com.pfe.stats.pfe.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pfe.stats.pfe.entities.Module;
import com.pfe.stats.pfe.entities.Question;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String>{
	
	public List<Question> findByModule(Module module);

}
