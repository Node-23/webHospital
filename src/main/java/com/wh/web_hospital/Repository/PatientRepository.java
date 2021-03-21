package com.wh.web_hospital.Repository;

import java.util.List;
import java.util.Optional;

import com.wh.web_hospital.Model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
    
    Optional<Patient> findById(long id);
    Patient findByEmail(String email);
    List<Patient> findByNameContainingIgnoreCase(String name);
}
