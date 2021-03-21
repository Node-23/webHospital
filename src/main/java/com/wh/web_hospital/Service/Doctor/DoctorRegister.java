package com.wh.web_hospital.Service.Doctor;

import com.wh.web_hospital.Exceptions.ServicesExceptions;
import com.wh.web_hospital.Model.Doctor;
import com.wh.web_hospital.Repository.DoctorRepository;
import com.wh.web_hospital.Service.CpfValidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorRegister {
    
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor register(Doctor doctor){
        Doctor searchedDoctor = doctorRepository.findByEmail(doctor.getEmail());
        
        if(searchedDoctor != null && !searchedDoctor.equals(doctor)){
            throw new ServicesExceptions("This email is already in use!");
        }

        if(CpfValidation.cpfVerification(doctor.getCpf()) == false){
            throw new ServicesExceptions("This CPF is invalid!");
        }

        return doctorRepository.save(doctor);

    }
    
    public void delete(Long id){
        doctorRepository.deleteById(id);
    }
    
}
