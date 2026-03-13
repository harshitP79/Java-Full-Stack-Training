package com.Harshit.DoctorService.service;

import com.Harshit.DoctorService.entity.Doctor;
import com.Harshit.DoctorService.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository repository;

    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    public Doctor saveDoctor(Doctor doctor){
        return repository.save(doctor);
    }

    public List<Doctor> getAllDoctors(){
        return repository.findAll();
    }

    public Doctor getDoctor(Long id){
        return repository.findById(id).orElseThrow();
    }

    public void deleteDoctor(Long id){
        repository.deleteById(id);
    }
}
