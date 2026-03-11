package com.Harshit.DoctorService.controller;


import com.Harshit.DoctorService.client.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DoctorController {
    private final RestTemplate restTemplate;
    private final UserClient userClient;

    public DoctorController(RestTemplate restTemplate, UserClient userClient){
        this.restTemplate=restTemplate;
        this.userClient = userClient;
    }
    @GetMapping("/doctor")
    public String getDoctor(){
        String users = userClient.getUsers();
        return  "Doctors Fetched. Also Calling --> "+users;
    }

}
