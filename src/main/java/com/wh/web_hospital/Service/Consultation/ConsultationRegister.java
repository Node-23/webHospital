package com.wh.web_hospital.Service.Consultation;

import java.time.LocalDate;

import com.wh.web_hospital.Model.Consultation;
import com.wh.web_hospital.Model.ConsultationStatus;
import com.wh.web_hospital.Repository.ConsultationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultationRegister {
    
    @Autowired
    private ConsultationRepository consultationRepository;

    public Consultation create(Consultation consultation){
        consultation.setStatus(ConsultationStatus.SCHEDULED);
        //LocalDateTime now = LocalDateTime.now();
        consultation.setConsultationDateScheduled(LocalDate.now());

        return consultationRepository.save(consultation);
    }

}
