package com.hibernateTest.firstHiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMappingDemo {
	public static void main(String[] args) {
		
		
		Configuration cfg= new Configuration().configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		//first ques
		QuesOneToMany q1= new QuesOneToMany();
		q1.setQuesid(101);
		q1.setQues("What is java.......?");
	
		//first ans
		AnsOneToMany a1=new AnsOneToMany();
		a1.setAnsid(1);
		a1.setAns("java is high level programming language..");
		a1.setQues(q1);
		
		//second ans
		AnsOneToMany a2=new AnsOneToMany();
		a2.setAnsid(2);
		a2.setAns("java is develope by games gosling..");
		a2.setQues(q1);
		
		
		// Add answers to question
		q1.getAnswers().add(a1);
		q1.getAnswers().add(a2);
		
		
		// Save
		session.persist(q1);
		session.persist(a1);
		session.persist(a2);
		tx.commit();
		
		// fetch the data
		QuesOneToMany q =
		        session.get(QuesOneToMany.class, 101);

		System.out.println("Question Id : " + q.getQuesid());
		System.out.println("Question : " + q.getQues());

		for(AnsOneToMany ans : q.getAnswers()) {
		    System.out.println(ans.getAnsid()
		            + " -> "
		            + ans.getAns());
		}
		

		session.close();
		sf.close();
	}

}
