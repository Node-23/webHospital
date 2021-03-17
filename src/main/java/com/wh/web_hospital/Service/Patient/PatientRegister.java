package com.wh.web_hospital.Service.Patient;

import com.wh.web_hospital.Model.Patient;
import com.wh.web_hospital.Repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientRegister {
    
    @Autowired
    private PatientRepository patientRepository;

    public Patient register(Patient patient){
        return patientRepository.save(patient);
    }

    public void delete(Long id){
        patientRepository.deleteById(id);
    }
}
