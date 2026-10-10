package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        SessionFactory sessionFactory=configuration.configure("config.xml").buildSessionFactory();

        Question question=new Question();
        question.setQuestionId(101);
        question.setQues("what is java");

        Answer answer1=new Answer();
        answer1.setAnswerId(1001);
        answer1.setAns("java is a programing language");

        Answer answer2=new Answer();
        answer2.setAnswerId(10001);
        answer2.setAns("java is help to make application");

        Answer answer3=new Answer();
        answer3.setAnswerId(100001);
        answer3.setAns("java is secure language");

        List<Answer> answerList=new ArrayList<>();
        answerList.add(answer1);
        answerList.add(answer2);
        answerList.add(answer3);

        question.setAnswerList(answerList);

        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(question);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}