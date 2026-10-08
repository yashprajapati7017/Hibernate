package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        SessionFactory sessionFactory=configuration.configure().buildSessionFactory();

        Student student=new Student();
        student.setName("amit");
        student.setRoll_no(101);

        Certificate certificate=new Certificate();
        certificate.setCourse("java");
        certificate.setCourse("1.5");
        student.setCertificate(certificate);

        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);

        session.getTransaction();
        session.close();;
        sessionFactory.close();

    }
}