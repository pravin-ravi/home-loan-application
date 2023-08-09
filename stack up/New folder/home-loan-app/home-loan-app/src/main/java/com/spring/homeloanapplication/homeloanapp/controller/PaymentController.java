package com.spring.homeloanapplication.homeloanapp.controller;



import com.spring.homeloanapplication.homeloanapp.model.Payment;
import com.spring.homeloanapplication.homeloanapp.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{paymentId}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable long paymentId){
        return paymentService.getPaymentById(paymentId);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Payment>> getPaymentsByUser(@PathVariable long userId){
        return paymentService.getPaymentsByUser(userId);
    }

    @PostMapping("/pay")
    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment){
        return paymentService.makePayment(payment);
    }

}
