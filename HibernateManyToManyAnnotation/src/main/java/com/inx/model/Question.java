package com.inx.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION_MTM_ANNOTATED")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	
	private String question;
	
	@ManyToMany(targetEntity = Answer.class, cascade = {CascadeType.ALL})
	@JoinTable(name="question_answer",
		joinColumns = {@JoinColumn(name = "q_id")},
		inverseJoinColumns = {@JoinColumn(name  = "ans_id")})
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
