package com.hibernateTest.firstHiber;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMappingDemo {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory fectory=cfg.buildSessionFactory();
	    Session session= fectory.openSession();
		Transaction tx= session.beginTransaction();
		
		// first question and ans....
		Question q1=new Question();
		q1.setQuestionid(101);
		q1.setQuestion("what is java....?");
		Answear a1=new Answear();
		a1.setAnswear("java is a high level....");
		a1.setAnswearid(201);
		q1.setAns(a1);
		
		
		// second question and ans....
				Question q2=new Question();
				q2.setQuestionid(102);
				q2.setQuestion("what is variable....?");
				Answear a2=new Answear();
				a2.setAnswear("variable is a container which is store the data......");
				a2.setAnswearid(202);
				q2.setAns(a2);
		
		
		session.persist(q1);
		session.persist(a1);
		session.persist(q2);
		session.persist(a2);
		
	
		
		tx.commit();
		
		
		//print first question
		Question p= (Question)session.get(Question.class, 101);
		System.out.println(p.getQuestion());
		System.out.println(p.getAns().getAnswear() );
		
		//print second question
		
		Question p1= (Question)session.get(Question.class, 102);
		System.out.println(p1.getQuestion());
		System.out.println(p1.getAns().getAnswear() );
		
		fectory.close();
		
	}

}
