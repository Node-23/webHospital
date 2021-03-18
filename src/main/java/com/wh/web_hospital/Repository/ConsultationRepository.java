package com.wh.web_hospital.Repository;

import com.wh.web_hospital.Model.Consultation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    
}
