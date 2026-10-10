package com.hibernate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Question {

    @Id
    private int questionId;
    private String ques;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Answer> answerList;

}
