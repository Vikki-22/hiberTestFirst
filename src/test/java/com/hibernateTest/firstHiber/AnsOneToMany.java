package com.hibernateTest.firstHiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class AnsOneToMany {
   @Id
   private int ansid;
   private String ans;
 @ManyToOne
   private QuesOneToMany ques;
   public AnsOneToMany() {
	super();
	// TODO Auto-generated constructor stub
   }
   public AnsOneToMany(int ansid, String ans, QuesOneToMany ques) {
	super();
	this.ansid = ansid;
	this.ans = ans;
	this.ques = ques;
   }
   public int getAnsid() {
	return ansid;
   }
   public void setAnsid(int ansid) {
	this.ansid = ansid;
   }
   public String getAns() {
	return ans;
   }
   public void setAns(String ans) {
	this.ans = ans;
   }
   public QuesOneToMany getQues() {
	return ques;
   }
   public void setQues(QuesOneToMany ques) {
	this.ques = ques;
   }
  
   
   
   
}
