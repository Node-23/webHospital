package com.wh.web_hospital.Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.wh.web_hospital.Domain.ValidationGroups;

@Entity
public class Patient implements Serializable {

    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = ValidationGroups.PatientId.class)
    private long id;

    @NotBlank
    @Size(max = 60)
    private String name;

    private LocalDate birthdate;

    @NotBlank
    @Size(max = 12, min = 9)
    private String phoneNumber;

    @NotBlank
    @Email
    @Size(max = 255)
    private String email;

    @NotBlank
    @Size(max = 300)
    private String address;
    
    @NotBlank
    @Size(max = 100)
    private String healthplan;

    public Patient() {
    }

    public Patient(long id, String name, LocalDate birthdate, String phoneNumber, String email, String address, String healthplan) {
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

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
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


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Patient)) {
            return false;
        }
        Patient patient = (Patient) o;
        return id == patient.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public boolean isPresent() {
        return false;
    }

    
}