package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        SessionFactory sessionFactory=configuration.configure("config.xml").buildSessionFactory();
//
//        Student student=new Student();
//        student.setId(103);
//        student.setName("Ayush");
//
//        Course course=new Course();
//        course.setCourse_Id(1003);
//        course.setSubject("english");
//
//        student.setCourse(course);

        Session session=sessionFactory.openSession();
        session.beginTransaction();


//        <------fetch Query------->
//        String query="from Student ";
//        Query q=session.createQuery(query);
//        List<Student>str=q.list();
//        for(Student s:str){
//            System.out.println(s.getId()+s.getName()+s.getCourse().getSubject());
//        }


//        <------update query-------->
//        Query q=(Query) session.createQuery("update Student set name=:c where name=:n");
//        q.setParameter("c","ankit");
//        q.setParameter("n","Amit");
//        int result=q.executeUpdate();
//        System.out.println(result);

//        <-------delete query-------->
//        Query q=session.createQuery("delete from Student where id=:i");
//        q.setParameter("i",102);
//        int result=q.executeUpdate();
//        System.out.println(result);

//        <------Join query---------->
        Query<Object[]> q=session.createQuery("select s.id,s.name,c.subject from Student as s inner JOIN s.course as c",Object[].class );
        List<Object[]> list = q.getResultList();

        for (Object[] arr : list) {
            System.out.println(Arrays.toString(arr));
        }


//        <------insert into database------>
//        session.save(student);
//        session.save(course);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}