package com.inx.model;

import java.util.Map;

public class Question {

	private int qid;
	
	private String question;
	
	private String username;
	
	private Map<String,String> answers;


	public Question() {
		//Default constructor
	}
	
	
	public Question(String question, String username, Map<String, String> answers) {
		super();
		this.question = question;
		this.username = username;
		this.answers = answers;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Map<String, String> getAnswers() {
		return answers;
	}


	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
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
