package com.spring.homeloanapplication.homeloanapp.repository;


import com.spring.homeloanapplication.homeloanapp.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByPaymentId(long paymentId);

    List<Payment> findAllByUserId(long userId);
}
