package com.wh.web_hospital.Controller;

import javax.validation.Valid;

import com.wh.web_hospital.Model.Consultation;
import com.wh.web_hospital.Service.Consultation.ConsultationRegister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/webhospital")
public class ConsultationController {
    
    @Autowired
    private ConsultationRegister consultationRegister;


    @PostMapping("/consultation/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Consultation create(@Valid @RequestBody Consultation consultation){
        return consultationRegister.create(consultation);
    }

}
