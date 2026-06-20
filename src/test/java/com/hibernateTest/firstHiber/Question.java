package com.hibernateTest.firstHiber;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
     
	@Id
	@Column(name="Question_id")
	private int Questionid;
	private String question;
	@OneToOne 
	private Answear ans;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int questionid, String question, Answear ans) {
		super();
		Questionid = questionid;
		this.question = question;
		this.ans = ans;
	}
	public int getQuestionid() {
		return Questionid;
	}
	public void setQuestionid(int questionid) {
		Questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answear getAns() {
		return ans;
	}
	public void setAns(Answear ans) {
		this.ans = ans;
	}
	
	
	
}
