package com.hibernateTest.Day2;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity(name="StudentDay2")
public class Student {
 @Id
 private int studentId;
 private String studentName;
 
 @ManyToMany 
@JoinTable(name="student_course" ,
joinColumns = @JoinColumn(name="student_id"),
inverseJoinColumns = @JoinColumn(name="course_id")
)
 private java.util.List<Course> courses=new ArrayList<Course>();

 public Student() {
	super();
	// TODO Auto-generated constructor stub
 }

 public Student(int studentId, String studentName, List<Course> courses) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.courses = courses;
 }

 public int getStudentId() {
	return studentId;
 }

 public void setStudentId(int studentId) {
	this.studentId = studentId;
 }

 public String getStudentName() {
	return studentName;
 }

 public void setStudentName(String studentName) {
	this.studentName = studentName;
 }

 public java.util.List<Course> getCourses() {
	return courses;
 }

 public void setCourses(java.util.List<Course> courses) {
	this.courses = courses;
 }
 
 
}
