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


        Configuration config= new Configuration();

        SessionFactory sessionFactory= config.configure().buildSessionFactory();

        Tution tution=new Tution();
        tution.setId(1);
        tution.setName("kunal");
        tution.setCourse("history");
        tution.setBatch(3);
        System.out.println(tution);

        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(tution);
        session.getTransaction().commit();
        session.close();
    }
}