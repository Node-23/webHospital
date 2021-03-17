package com.wh.web_hospital.Service.Patient;

import com.wh.web_hospital.Exceptions.ServicesExceptions;
import com.wh.web_hospital.Model.Patient;
import com.wh.web_hospital.Repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientRegister {
    
    @Autowired
    private PatientRepository patientRepository;

    public Patient register(Patient patient){
        Patient searchedPatient = patientRepository.findByEmail(patient.getEmail());

        if(searchedPatient != null && !searchedPatient.equals(patient)){
            throw new ServicesExceptions("This email is already in use!");
        }

        return patientRepository.save(patient);
    }

    public void delete(Long id){
        patientRepository.deleteById(id);
    }
}
