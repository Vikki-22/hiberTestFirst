package com.hibernateTest.firstHiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
 public static void main(String[] args) {
	Configuration cfg= new Configuration().configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Student st=(Student)session.get(Student.class, 1);
	
	System.out.println(st);
	Student st2 = session.byId(Student.class).getReference(1);	//	System.out.println(st2.getName());
	session.close();
	System.out.println(st2.getName());
	sf.close();
}
}
