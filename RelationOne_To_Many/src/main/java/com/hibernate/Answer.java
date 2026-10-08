package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {

    @Id
    private int Answer_id;
    private String Ans;


    public int getAnswer_id() {
        return Answer_id;
    }

    public void setAnswer_id(int answer_id) {
        Answer_id = answer_id;
    }

    public String getAns() {
        return Ans;
    }

    public void setAns(String ans) {
        Ans = ans;
    }
}
