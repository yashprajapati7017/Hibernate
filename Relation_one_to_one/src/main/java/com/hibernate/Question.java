package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {

    @Id
    private int Question_id;
    private String Ques;

    @OneToOne
    private Answer answer;

    public int getQuestion_id() {
        return Question_id;
    }

    public void setQuestion_id(int question_id) {
        Question_id = question_id;
    }

    public String getQues() {
        return Ques;
    }

    public void setQues(String ques) {
        Ques = ques;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }


}
