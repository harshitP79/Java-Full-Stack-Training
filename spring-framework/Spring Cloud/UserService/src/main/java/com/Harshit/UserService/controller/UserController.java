package com.Harshit.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/all")
    public List<String> getUser(){
        return  List.of("Aman","Harshit","Akriti","Ankita");
    }
}
