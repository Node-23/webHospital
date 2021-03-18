package com.wh.web_hospital.Repository;

import java.util.Optional;

import com.wh.web_hospital.Model.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{
    
    Optional<Doctor>findById(long id);
    Doctor findByEmail(String email);

}
