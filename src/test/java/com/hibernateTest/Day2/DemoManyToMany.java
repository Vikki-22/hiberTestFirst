package com.hibernateTest.Day2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoManyToMany {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory sf= cfg.buildSessionFactory();
	
	
		
		// for fetching  data
		
		Session se= sf.openSession();
		//first record
		Student st1=se.get(Student.class, 101);
		System.out.println("Student Id :"+st1.getStudentId());
		System.out.println("Student Name :"+st1.getStudentName());
		
		System.out.println("Course   :");
		
		for(Course c : st1.getCourses()) {
			 System.out.println(c.getCourseid()
			            + " -> "
			            + c.getCoursename());
		}
		
		
		//second record
				Student st2=se.get(Student.class, 102);
				System.out.println("Student Id :"+st2.getStudentId());
				System.out.println("Student Name :"+st2.getStudentName());
				
				System.out.println("Course   :");
				
				for(Course c : st2.getCourses()) {
					 System.out.println(c.getCourseid()
					            + " -> "
					            + c.getCoursename());
				}
				sf.close();
				
		
	}

}
