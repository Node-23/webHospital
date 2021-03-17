package com.wh.web_hospital.Model;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Consultation implements Serializable {
 
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    private Doctor doctor;

    @NotBlank
    private Patient patient;

    @NotBlank
    private LocalDate consultationDate;

    @NotBlank
    private Time consultationTime;

    @NotBlank
    private String consultationResume;

    @NotBlank
    private float price;
    

    public Consultation() {
    }

    public Consultation(long id, Doctor doctor, Patient patient, LocalDate consultationDate, Time consultationTime, String consultationResume, float price) {
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

    public LocalDate getConsultationDate() {
        return this.consultationDate;
    }

    public void setConsultationDate(LocalDate consultationDate) {
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


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Consultation)) {
            return false;
        }
        Consultation consultation = (Consultation) o;
        return id == consultation.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
    
}