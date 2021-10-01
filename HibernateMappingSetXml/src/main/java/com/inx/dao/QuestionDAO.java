package com.inx.dao;

import java.util.List;

import com.inx.model.Question;

public interface QuestionDAO {

	public void save(Question question);
	
	public List<Question> getQuestionAnswers();
	
}
