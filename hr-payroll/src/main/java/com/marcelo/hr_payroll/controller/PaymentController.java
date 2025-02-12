package com.marcelo.hr_payroll.controller;

import com.marcelo.hr_payroll.entities.Payment;
import com.marcelo.hr_payroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        Payment payment = this.paymentService.getPayment(workerId,days);
        ResponseEntity responseEntity = new ResponseEntity(payment, HttpStatus.OK);
        return responseEntity;
    }
}
