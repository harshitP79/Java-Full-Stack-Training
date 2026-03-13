package com.Harshit.DoctorService.repository;


import com.Harshit.DoctorService.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}