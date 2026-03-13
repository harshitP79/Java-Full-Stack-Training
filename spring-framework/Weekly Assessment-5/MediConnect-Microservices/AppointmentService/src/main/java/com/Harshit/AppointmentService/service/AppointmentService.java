package com.Harshit.AppointmentService.service;

import com.Harshit.AppointmentService.Client.DoctorClient;
import com.Harshit.AppointmentService.entity.Appointment;
import com.Harshit.AppointmentService.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository repository;
    private final DoctorClient doctorClient;

    public AppointmentService(AppointmentRepository repository, DoctorClient doctorClient) {
        this.repository = repository;
        this.doctorClient = doctorClient;
    }

    public Appointment createAppointment(Appointment appointment){

        doctorClient.getDoctor(appointment.getDoctorId());

        appointment.setStatus("BOOKED");

        return repository.save(appointment);
    }

    public List<Appointment> getAppointments(){
        return repository.findAll();
    }

    public Appointment getAppointment(Long id){
        return repository.findById(id).orElseThrow();
    }

    public void deleteAppointment(Long id){
        repository.deleteById(id);
    }
}