package com.Harshit.DoctorService.controller;

import com.Harshit.DoctorService.client.UserClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    private final UserClient userClient;

    public DoctorController(UserClient userClient){
        this.userClient = userClient;
    }

    @GetMapping("/doctors")
    @CircuitBreaker(name = "userService",fallbackMethod = "userFallback")
    public String getDoctor(){
        String users = userClient.getUsers();
        return "Doctors Fetched. Also Calling --> " + users;
    }

    public String userFallback(Throwable ex){
        return "User Service is currently unavailable. Showing cached doctor data.";
    }
}