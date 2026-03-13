package com.Harshit.DoctorService.controller;

import com.Harshit.DoctorService.entity.Doctor;
import com.Harshit.DoctorService.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService service;

    public DoctorController(DoctorService service) {
        this.service = service;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return service.saveDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> getDoctors(){
        return service.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable Long id){
        return service.getDoctor(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id){
        service.deleteDoctor(id);
    }
}