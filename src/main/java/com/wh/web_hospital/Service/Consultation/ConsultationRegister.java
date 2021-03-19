package com.wh.web_hospital.Service.Consultation;

import java.time.LocalDate;

import com.wh.web_hospital.Exceptions.ServicesExceptions;
import com.wh.web_hospital.Model.Consultation;
import com.wh.web_hospital.Model.ConsultationStatus;
import com.wh.web_hospital.Model.Doctor;
import com.wh.web_hospital.Model.Patient;
import com.wh.web_hospital.Repository.ConsultationRepository;
import com.wh.web_hospital.Repository.DoctorRepository;
import com.wh.web_hospital.Repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultationRegister {
    
    @Autowired
    private ConsultationRepository consultationRepository;
    
    @Autowired
    private DoctorRepository DoctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    public Consultation create(Consultation consultation){
        Doctor doctor = DoctorRepository.findById(consultation.getDoctor().getId())
        .orElseThrow(() -> new ServicesExceptions("Doctor not found!"));

        Patient patient = patientRepository.findById(consultation.getPatient().getId())
        .orElseThrow(() -> new ServicesExceptions("Patient not found!"));

        consultation.setDoctor(doctor);
        consultation.setPatient(patient);
        consultation.setStatus(ConsultationStatus.SCHEDULED);
        consultation.setConsultationDateScheduled(LocalDate.now());

        return consultationRepository.save(consultation);
    }

}
