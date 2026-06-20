package com.hibernateTest.firstHiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id @GeneratedValue
private int id;
private String Name;
private int Age;
private Address add;
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Student [id=" + id + ", Name=" + Name + ", Age=" + Age + "]";
}
public Student(String name, int age) {
	super();

	Name = name;
	Age = age;
}

  

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
	Configuration cfg= new Configuration().configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Student s= new Student( "Raamu", 20);
	Student s2= new Student( "Kaalu", 22);
	Student s3= new Student( "Bhura", 22);
	Transaction tx=session.beginTransaction();
	
	session.persist(s);

	session.persist(s2);

	session.persist(s3);
	tx.commit();
	System.out.println("data enter Successfully.....");
	session.close();
	sf.close();
	
}

}
