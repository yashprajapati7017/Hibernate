package com.hibernate;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Table(name="Student_Address")
public class Atriubute {

    @Id
    @Column(name ="Entry_no")
    @GeneratedValue
    private int id;
    private int houseCode;
    private String Address;
    private String street;
    @Transient
    private int pinCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(int houseCode) {
        this.houseCode = houseCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Atriubute{" +
                "houseCode=" + houseCode +
                ", Address='" + Address + '\'' +
                ", street='" + street + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
