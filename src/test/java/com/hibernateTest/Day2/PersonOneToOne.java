package com.hibernateTest.Day2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PersonOneToOne {
	 @Id
	 private int personid;
	 private String personName;
	 @OneToOne
	 @JoinColumn(name="person_id")
	 private PassportOnetoOne passport;
	 public PersonOneToOne() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public PersonOneToOne(int personid, String personName, PassportOnetoOne passport) {
		super();
		this.personid = personid;
		this.personName = personName;
		this.passport = passport;
	 }
	 public int getPersonid() {
		 return personid;
	 }
	 public void setPersonid(int personid) {
		 this.personid = personid;
	 }
	 public String getPersonName() {
		 return personName;
	 }
	 public void setPersonName(String personName) {
		 this.personName = personName;
	 }
	 public PassportOnetoOne getPassport() {
		 return passport;
	 }
	 public void setPassport(PassportOnetoOne passport) {
		 this.passport = passport;
	 }
	 
	 
	 
	

}
