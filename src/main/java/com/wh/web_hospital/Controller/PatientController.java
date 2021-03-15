package com.wh.web_hospital.Controller;

import java.util.List;

import com.wh.web_hospital.Model.Patient;
import com.wh.web_hospital.Repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/webhospital")
public class PatientController {
    
    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> getPatients(){
        return patientRepository.findAll();
    }

    @GetMapping("/patients/{id}")
    public Patient getPatient(@PathVariable(value = "id") long id){
        return patientRepository.findById(id);
    }

    @PostMapping("/patients/new")
    public Patient newPatient(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }
}
