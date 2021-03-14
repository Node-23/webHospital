package com.wh.web_hospital.Model;

public class Patient {

    private long id;
    private String name;
    private Date birthdate;
    private String phoneNumber;
    private String email;
    private String address;
    private String healthplan;

    public Patient() {
    }

    public Patient(long id, String name, Date birthdate, String phone, String email, String address, String healthplan) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.phone = phone;
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

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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