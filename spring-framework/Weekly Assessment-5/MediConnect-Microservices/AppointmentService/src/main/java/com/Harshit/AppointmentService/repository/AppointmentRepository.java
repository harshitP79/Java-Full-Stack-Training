package com.Harshit.AppointmentService.repository;

import com.Harshit.AppointmentService.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}