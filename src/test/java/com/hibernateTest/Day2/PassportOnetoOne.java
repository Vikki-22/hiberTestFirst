package com.hibernateTest.Day2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PassportOnetoOne {
	@Id
	private int passportid;
	private String passportno;
	public PassportOnetoOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassportOnetoOne(int passportid, String passportno) {
		super();
		this.passportid = passportid;
		this.passportno = passportno;
	}
	public int getPassportid() {
		return passportid;
	}
	public void setPassportid(int passportid) {
		this.passportid = passportid;
	}
	public String getPassportno() {
		return passportno;
	}
	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}
	
	
	

}
