package com.hibernateTest.Day2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DepartmentManytoOne {
	@Id
	private int deptid;
	private String deptName;
	public DepartmentManytoOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentManytoOne(int deptid, String deptName) {
		super();
		this.deptid = deptid;
		this.deptName = deptName;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
	
	

}
