package com.hibernateTest.Day2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoManyToOne {

    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();

        // Save Data
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        DepartmentManytoOne d = new DepartmentManytoOne();
        d.setDeptid(1);
        d.setDeptName("IT");

        EmployeeManytoOne e1 = new EmployeeManytoOne();
        e1.setEmpid(101);
        e1.setEmpName("Vikki");
        e1.setDepartment(d);

        EmployeeManytoOne e2 = new EmployeeManytoOne();
        e2.setEmpid(102);
        e2.setEmpName("Anuj");
        e2.setDepartment(d);

        session.persist(d);
        session.persist(e1);
        session.persist(e2);

        tx.commit();
        session.close();

        System.out.println("Data Saved Successfully");
        System.out.println("----------------------");

        // Fetch Data
        Session session2 = sf.openSession();

        EmployeeManytoOne emp1 =
                session2.get(EmployeeManytoOne.class, 101);

        System.out.println("Employee Id : " + emp1.getEmpid());
        System.out.println("Employee Name : " + emp1.getEmpName());
        System.out.println("Department : "
                + emp1.getDepartment().getDeptName());

        System.out.println("----------------------");

        EmployeeManytoOne emp2 =
                session2.get(EmployeeManytoOne.class, 102);

        System.out.println("Employee Id : " + emp2.getEmpid());
        System.out.println("Employee Name : " + emp2.getEmpName());
        System.out.println("Department : "
                + emp2.getDepartment().getDeptName());

        session2.close();
        sf.close();
    }
}