package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Configuration conf=new Configuration();
        conf.configure();
        SessionFactory sessionFactory= conf.buildSessionFactory();
        //System.out.println(sessionFactory);

        Student student=new Student();
        student.setId(108);
        student.setName("rohan");
        student.setCourse("c#");

        //System.out.println(student);

        Atriubute atriubute=new Atriubute();
        atriubute.setHouseCode(1112);
        atriubute.setStreet("metro nagar");
        atriubute.setPinCode(25000);
        atriubute.setAddress(" bhrumpui");
        //System.out.println(atriubute);

        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.save(atriubute);
        session.getTransaction().commit();
        session.close();

    }
}