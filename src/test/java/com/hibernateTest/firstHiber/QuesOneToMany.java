package com.hibernateTest.firstHiber;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class QuesOneToMany {
	@Id
	private int quesid;
	private String ques;
	@OneToMany(mappedBy = "ques")
	private List<AnsOneToMany> answers = new ArrayList<>();
	public QuesOneToMany() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuesOneToMany(int quesid, String ques, List<AnsOneToMany> answers) {
		super();
		this.quesid = quesid;
		this.ques = ques;
		this.answers = answers;
	}
	public int getQuesid() {
		return quesid;
	}
	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<AnsOneToMany> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AnsOneToMany> answers) {
		this.answers = answers;
	}
	 
	
	
	

}
