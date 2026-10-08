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

        Question question=new Question();
        question.setQuestion_id(101);
        question.setQues("what is java");

        Answer answer=new Answer();
        answer.setAnswer_id(1001);
        answer.setAns("Java is Programing Language");
        question.setAnswer(answer);

        Question question2=new Question();
        question2.setQuestion_id(102);
        question2.setQues("what is collection Framwork");

        Answer answer2=new Answer();
        answer2.setAnswer_id(1002);
        answer2.setAns("This is a api that work on object");
        question2.setAnswer(answer2);

        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(question);
        session.save(question2);
        session.save(answer);
        session.save(answer2);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}