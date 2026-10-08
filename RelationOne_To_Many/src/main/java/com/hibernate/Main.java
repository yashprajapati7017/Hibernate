package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        SessionFactory sessionFactory=configuration.configure().buildSessionFactory();

        Question question=new Question();
        question.setQuestion_id(101);
        question.setQues("what is java");

        Answer answer=new Answer();
        answer.setAnswer_id(1001);
        answer.setAns("Java is a programing language");

        Answer answer1=new Answer();
        answer1.setAnswer_id(1002);
        answer1.setAns("Java is use to bild application");

        Answer answer2=new Answer();
        answer2.setAnswer_id(1003);
        answer2.setAns("Java is a very secure Language");

        List<Answer> answerList=new ArrayList<>();
        answerList.add(answer);
        answerList.add(answer1);
        answerList.add(answer2);
        question.setAnswer(answerList);

        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(question);
        session.save(answer);
        session.save(answer1);
        session.save(answer2);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}