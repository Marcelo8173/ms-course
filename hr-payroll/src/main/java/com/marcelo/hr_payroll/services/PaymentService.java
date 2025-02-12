package com.marcelo.hr_payroll.services;

import com.marcelo.hr_payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days) {
        Payment payment = new Payment("marcelo", 200.0, days);
        return payment;
    }
}
