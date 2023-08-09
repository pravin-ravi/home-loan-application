package com.spring.homeloanapplication.homeloanapp.service;


import com.spring.homeloanapplication.homeloanapp.model.LoanRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LoanRequestService {
    public ResponseEntity<List<LoanRequest>> getAllLoanRequests();

    public ResponseEntity<LoanRequest> getLoanRequestById(long loanRequestId);

    public ResponseEntity<List<LoanRequest>> getLoanRequestsByUser(long userId);

    public ResponseEntity<LoanRequest> addLoanRequest(LoanRequest loanRequest);

    public void deleteLoanRequest(long loanRequestId);

    public ResponseEntity<LoanRequest> approveLoan(LoanRequest loanRequest, long loanRequestId);

    public ResponseEntity<LoanRequest> declineLoan(long loanRequestId);

    public ResponseEntity<LoanRequest> editLoanRequest(LoanRequest loanRequest, long loanRequestId);
}
