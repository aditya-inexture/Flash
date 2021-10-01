package com.inx.model;

import java.util.List;

public class Question {

	private int qid;
	
	private String question;
	
	private List<String> answers;

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public Question() {
		//Default constructor
	}
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
}
