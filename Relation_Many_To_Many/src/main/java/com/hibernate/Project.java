package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Project {

    @Id
    private int Projrct_id;
    private String projrct_Name;
    @ManyToMany
    private List<Employees> employees;

    public int getProjrct_id() {
        return Projrct_id;
    }

    public void setProjrct_id(int projrct_id) {
        Projrct_id = projrct_id;
    }

    public String getProjrct_Name() {
        return projrct_Name;
    }

    public void setProjrct_Name(String projrct_Name) {
        this.projrct_Name = projrct_Name;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }
}
