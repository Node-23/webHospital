package com.wh.web_hospital.Model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consultation implements Serializable {
 
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private Doctor doctor;
    @Column(nullable = false)
    private Patient patient;
    @Column(nullable = false)
    private Date consultationDate;
    @Column(nullable = false)
    private Time consultationTime;
    @Column(nullable = false)
    private String consultationResume;
    @Column(nullable = false)
    private float price;
    

    public Consultation() {
    }

    public Consultation(long id, Doctor doctor, Patient patient, Date consultationDate, Time consultationTime, String consultationResume, float price) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.consultationDate = consultationDate;
        this.consultationTime = consultationTime;
        this.consultationResume = consultationResume;
        this.price = price;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getConsultationDate() {
        return this.consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    public Time getConsultationTime() {
        return this.consultationTime;
    }

    public void setConsultationTime(Time consultationTime) {
        this.consultationTime = consultationTime;
    }

    public String getConsultationResume() {
        return this.consultationResume;
    }

    public void setConsultationResume(String consultationResume) {
        this.consultationResume = consultationResume;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}