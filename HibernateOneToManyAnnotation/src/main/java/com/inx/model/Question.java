package com.inx.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION_OTM_ANNOTATED")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	
	private String question;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "question_id")
	@OrderColumn(name = "type")
	private List<Answer> answers;

	public Question() {
		//Default constructor
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
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
