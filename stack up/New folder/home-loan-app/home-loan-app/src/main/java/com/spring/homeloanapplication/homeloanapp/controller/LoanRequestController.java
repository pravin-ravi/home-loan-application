package com.spring.homeloanapplication.homeloanapp.controller;



import com.spring.homeloanapplication.homeloanapp.model.LoanRequest;
import com.spring.homeloanapplication.homeloanapp.service.LoanRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1.0/loanRequest")
public class LoanRequestController {

    @Autowired
    LoanRequestService loanRequestService;


    @GetMapping("/")
    public ResponseEntity<List<LoanRequest>> getLoanRequests(){
        return loanRequestService.getAllLoanRequests();
    }

    @GetMapping("/{loanRequestId}")
    public ResponseEntity<LoanRequest> getLoanRequestById(@PathVariable long loanRequestId){
        return loanRequestService.getLoanRequestById(loanRequestId);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<LoanRequest>> getLoanRequestsByUser(@PathVariable long userId){
        return loanRequestService.getLoanRequestsByUser(userId);
    }

    @PostMapping("/")
    public ResponseEntity<LoanRequest> addLoanRequest(@RequestBody LoanRequest loanRequest){
        return loanRequestService.addLoanRequest(loanRequest);
    }

    @DeleteMapping("/{loanRequestId}")
    public void deleteLoanRequest(@PathVariable long loanRequestId){
        loanRequestService.deleteLoanRequest(loanRequestId);
        return;
    }

    @PostMapping("/approve/{loanRequestId}")
    public ResponseEntity<LoanRequest> approveLoanRequest(@RequestBody LoanRequest loanRequest, @PathVariable long loanRequestId){
        return loanRequestService.approveLoan(loanRequest, loanRequestId);
    }

    @PostMapping("/decline/{loanRequestId}")
    public ResponseEntity<LoanRequest> declineLoanRequest(@PathVariable long loanRequestId){
        return loanRequestService.declineLoan(loanRequestId);
    }

    @PutMapping("/{loanRequestId}")
    public ResponseEntity<LoanRequest> editLoanRequest(@RequestBody LoanRequest loanRequest, @PathVariable long loanRequestId){
        return loanRequestService.editLoanRequest(loanRequest, loanRequestId);
    }
}
