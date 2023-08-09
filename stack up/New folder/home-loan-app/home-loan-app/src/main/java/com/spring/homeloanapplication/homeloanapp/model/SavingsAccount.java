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
public class SavingsAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long savingsAccountNumber;
    private long userId;

}
