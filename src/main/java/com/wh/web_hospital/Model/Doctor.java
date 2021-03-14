package com.wh.web_hospital.Model;

public class Doctor {

   private long id;
   private String name;
   private String phoneNumber;
   private String email;
   private String speciality;


    public Doctor() {
    }

    public Doctor(long id, String name, String phoneNumber, String email, String speciality) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.speciality = speciality;
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

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}