package com.Harshit.AppointmentService.controller;

import com.Harshit.AppointmentService.entity.Appointment;
import com.Harshit.AppointmentService.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @PostMapping
    public Appointment create(@RequestBody Appointment appointment){
        return service.createAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> getAll(){
        return service.getAppointments();
    }

    @GetMapping("/{id}")
    public Appointment get(@PathVariable Long id){
        return service.getAppointment(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.deleteAppointment(id);
    }
}