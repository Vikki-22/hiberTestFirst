package com.hibernateTest.Day2;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
@Id
private int courseid;
private String coursename;
@ManyToMany (mappedBy = "courses")
private List<Student> students= new ArrayList<Student>();
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(int courseid, String coursename, List<Student> students) {
	super();
	this.courseid = courseid;
	this.coursename = coursename;
	this.students = students;
}
public int getCourseid() {
	return courseid;
}
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}


}
