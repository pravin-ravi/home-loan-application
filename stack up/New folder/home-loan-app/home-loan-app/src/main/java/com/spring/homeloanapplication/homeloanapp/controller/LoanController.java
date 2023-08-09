package com.spring.homeloanapplication.homeloanapp.controller;



import com.spring.homeloanapplication.homeloanapp.model.Loan;
import com.spring.homeloanapplication.homeloanapp.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/loan")
public class LoanController {

    @Autowired
    LoanService loanService;

    @GetMapping("/")
    public ResponseEntity<List<Loan>> getLoans(){
        return loanService.getAllLoans();
    }

    @GetMapping("/{loanId}")
    public ResponseEntity<Loan> getLoanById(@PathVariable long loanId){
        return loanService.getLoanById(loanId);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Loan>> getLoansByUser(@PathVariable long userId){
        return loanService.getLoansByUser(userId);
    }



}
