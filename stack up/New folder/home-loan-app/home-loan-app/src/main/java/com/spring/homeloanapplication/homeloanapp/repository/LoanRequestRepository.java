package com.spring.homeloanapplication.homeloanapp.repository;


import com.spring.homeloanapplication.homeloanapp.model.LoanRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRequestRepository extends JpaRepository<LoanRequest, Long>{

    LoanRequest findByLoanRequestId(long loanRequestId);
    List<LoanRequest> findAllByUserId(long userId);
}
