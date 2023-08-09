package com.spring.homeloanapplication.homeloanapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LoanRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long loanRequestId;
    private long userId;
    private String description;
    private long salary;
    private long amount;
    private long tenure;
    private String status;


}
