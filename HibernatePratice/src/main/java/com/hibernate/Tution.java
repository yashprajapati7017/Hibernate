package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tution {

    @Id
    private int id;
    private String name;
    private String course;
    private int batch;

    public Tution() {
    }

    public Tution(int id, String name, String course, int batch) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.batch = batch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Tution{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", batch=" + batch +
                '}';
    }
}
