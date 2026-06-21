package com.hibernateTest.Day2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoOneToOne {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx= session.beginTransaction();
		
		//first value of person
	  PersonOneToOne p=new PersonOneToOne();
	  p.setPersonid(101);
	  p.setPersonName("Vikki Chandrawanshi");
	  
	  PassportOnetoOne pp= new PassportOnetoOne();
	  pp.setPassportid(1);
	  pp.setPassportno("A24545B");
	  p.setPassport(pp);
		
	  session.persist(p);
	  session.persist(pp);
	  
		
		tx.commit();
		session.close();
		
		
	
		Session session2=sf.openSession();
		
		PersonOneToOne p5= (PersonOneToOne)session2.get(PersonOneToOne.class, 101);
		System.out.println(p5.getPersonid());
		System.out.println(p5.getPersonName());
		System.out.println(p5.getPassport().getPassportno());
		sf.close();
		
		
		
	}

}
