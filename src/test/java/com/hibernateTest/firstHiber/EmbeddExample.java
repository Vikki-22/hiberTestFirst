package com.hibernateTest.firstHiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddExample {
	
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory fectory=cfg.buildSessionFactory();
		Session session = fectory.openSession();
		
		// first value insert
		Student st= new Student();
		st.setName("Vikki Chandrawanshi");
		st.setAge(22);
		Address ad=new Address();
		ad.setCity("Seoni");
		ad.setState("MP");
		ad.setPincode(480661);
		st.setAdd(ad);
		
		
		// first value insert
		Student st1= new Student();
		st1.setName("MAniya Chandel");
		st1.setAge(20);
		Address ad1=new Address();
		ad1.setCity("Seoni");
		ad1.setState("MP");
		ad1.setPincode(480661);
		st1.setAdd(ad1);
		
		Transaction tx=session.beginTransaction();
			session.persist(st);
			session.persist(st1);
			System.out.println("data insert successsfully......................");
		tx.commit();
		fectory.close();
		session.close();
		
	}

}
