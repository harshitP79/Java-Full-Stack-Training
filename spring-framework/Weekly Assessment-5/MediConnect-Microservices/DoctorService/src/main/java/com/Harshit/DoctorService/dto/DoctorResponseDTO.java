package com.Harshit.DoctorService.dto;

import lombok.Data;

@Data
public class DoctorResponseDTO {

    private Long doctorId;
    private String name;
    private String specialization;
    private Integer experience;
    private String hospitalName;
    private String availability;
}
