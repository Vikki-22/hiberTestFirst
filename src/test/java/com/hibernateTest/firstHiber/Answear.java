package com.hibernateTest.firstHiber;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answear {
	@Id
	@Column(name="Answear_id")
	private int Answearid;
	private String answear;

	public Answear() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answear(int answearid, String answear) {
		super();
		Answearid = answearid;
		this.answear = answear;
		
	}
	public int getAnswearid() {
		return Answearid;
	}
	public void setAnswearid(int answearid) {
		Answearid = answearid;
	}
	public String getAnswear() {
		return answear;
	}
	public void setAnswear(String answear) {
		this.answear = answear;
	}

	
	
	
}
