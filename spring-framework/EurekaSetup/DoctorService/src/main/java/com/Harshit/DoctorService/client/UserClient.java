package com.Harshit.DoctorService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "USERSERVICE")
public interface UserClient {

    @GetMapping("/users")
    String getUsers();
}