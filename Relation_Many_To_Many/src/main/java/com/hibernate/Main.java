package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Configuration configuration=new Configuration();
        SessionFactory sessionFactory=configuration.configure("config.xml").buildSessionFactory();
//
//        Employees employees1=new Employees();
//        Employees employees2=new Employees();
//
//        employees1.setId(101);
//        employees1.setName("rahul");
//
//        employees2.setId(102);
//        employees2.setName("ankit");
//
//        Project project1=new Project();
//        Project project2=new Project();
//
//        project1.setProjrct_id(1001);
//        project1.setProjrct_Name("Library system");
//
//        project2.setProjrct_id(1002);
//        project2.setProjrct_Name("ATM machine");
//
//        List<Project> projectList=new ArrayList<>();
//        projectList.add(project1);
//        projectList.add(project2);
//
//        List<Employees>employeesList=new ArrayList<>();
//        employeesList.add(employees1);
//        employeesList.add(employees2);
//
//        employees1.setProjects(projectList);
//        employees2.setProjects(projectList);
//
//        project1.setEmployees(employeesList);
//        project2.setEmployees(employeesList);

        Session session=sessionFactory.openSession();


        // fetch data code
        Employees employees=(Employees) session.get(Employees.class,101);
        System.out.println(employees.getName());
        for(Project p: employees.getProjects()){
            System.out.println(p.getProjrct_Name());
        }


        session.beginTransaction();
//        session.save(employees1);
//        session.save(employees2);
//        session.save(project1);
//        session.save(project2);
//        session.getTransaction().commit();

        session.close();;
        sessionFactory.close();

    }
}