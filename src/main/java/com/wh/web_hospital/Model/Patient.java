package com.wh.web_hospital.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Date birthdate;
    private String phoneNumber;
    private String email;
    private String address;
    private String healthplan;

    public Patient() {
    }

    public Patient(long id, String name, Date birthdate, String phoneNumber, String email, String address, String healthplan) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.healthplan = healthplan;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealthplan() {
        return this.healthplan;
    }

    public void setHealthplan(String healthplan) {
        this.healthplan = healthplan;
    }


    
}