package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fatch {

    public static void main(String[] args){

        Configuration configuration=new Configuration();
        SessionFactory sessionFactory=configuration.configure().buildSessionFactory();

        Session session=sessionFactory.openSession();

        Student student=(Student)session.load(Student.class,103);

        System.out.println(student);

        session.close();
        sessionFactory.close();
    }
}
