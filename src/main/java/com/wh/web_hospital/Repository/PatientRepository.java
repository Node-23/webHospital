package com.wh.web_hospital.Repository;

import com.wh.web_hospital.Model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long>{
    
    Patient findById(long id);

}
