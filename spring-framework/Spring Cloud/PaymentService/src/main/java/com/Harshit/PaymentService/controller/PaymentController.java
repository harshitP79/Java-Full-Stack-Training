package com.Harshit.PaymentService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @GetMapping("/all")
    public List<String> getAllPayment(){
        return  List.of("UPI","CC","DC");
    }
}
