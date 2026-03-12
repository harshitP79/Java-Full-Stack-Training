package com.Harshit.DoctorService.controller;

import com.Harshit.DoctorService.client.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    private final UserClient userClient;

    public DoctorController(UserClient userClient){
        this.userClient = userClient;
    }

    @GetMapping("/doctors")
    public String getDoctor(){
        String users = userClient.getUsers();
        return "Doctors Fetched. Also Calling --> " + users;
    }
}