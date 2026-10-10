package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        SessionFactory sessionFactory=configuration.configure("config.xml").buildSessionFactory();
//
//        Student student1=new Student ();
//        student1.setName("rohan");
//        student1.setClassId(11);
//        student1.setMarks(89);
//        student1.setCity("mumbai");


//        Student student2=new Student();
//        student2.setName("kunal");
//        student2.setClassId(10);
//        student2.setMarks(79);
//        student2.setCity("rajisthan");

        Session session=sessionFactory.openSession();
        session.beginTransaction();

        Query query=(Query) session.createQuery("from Student ");

        query.setFirstResult(0);
        query.setMaxResults(3);
        List<Student>studentList=query.getResultList();
        for(Student s:studentList){
            System.out.println(s.getId()+" : "+s.getName()+" : "+s.getMarks()+" : "+s.getCity());
        }




//        session.save(student1);
//        session.save(student2);
//        session.getTransaction().commit();
        session.close();;
        sessionFactory.close();


    }
}