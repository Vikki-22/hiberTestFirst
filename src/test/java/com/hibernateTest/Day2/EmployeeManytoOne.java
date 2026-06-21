package com.hibernateTest.Day2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeManytoOne {

    @Id
    private int empid;

    private String empName;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private DepartmentManytoOne department;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public DepartmentManytoOne getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentManytoOne department) {
        this.department = department;
    }
}