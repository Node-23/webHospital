package com.wh.web_hospital.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.wh.web_hospital.Model.Doctor;
import com.wh.web_hospital.Repository.DoctorRepository;
import com.wh.web_hospital.Service.Doctor.DoctorRegister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/webhospital")
public class DoctorController {
    
    @Autowired
    private DoctorRepository doctorRepository;

     @Autowired
     private DoctorRegister doctorRegister;

    @GetMapping("/doctors")
    public List<Doctor> getPatients(){
        return doctorRepository.findAll();
    }

    @GetMapping("/doctors/contains")
    public List<Doctor> getDoctorsContains(@RequestBody String name){
        return doctorRepository.findByNameContainingIgnoreCase(name);
    }

    @GetMapping("/doctors/{id}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable(value = "id") long id){
        Optional<Doctor> doctor = doctorRepository.findById(id);
        if(doctor.isPresent()){
            return ResponseEntity.ok(doctor.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/doctors/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Doctor newDoctor(@Valid @RequestBody Doctor doctor){
        return doctorRegister.register(doctor);
    }

    @PutMapping("/doctors/edit/{id}")
    public ResponseEntity<Doctor> editDoctor(@Valid @PathVariable Long id,@RequestBody Doctor doctor){
        if(!doctorRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }

        doctor.setId(id);
        doctor = doctorRegister.register(doctor);

        return ResponseEntity.ok(doctor);
    }

    @DeleteMapping("/doctors/delete/{id}")
    public ResponseEntity<Void> removeDoctor(@PathVariable long id){
        if(!doctorRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        doctorRegister.delete(id);
        return ResponseEntity.noContent().build();
    } 

}
