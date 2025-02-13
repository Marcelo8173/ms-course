package com.marcelo.hr_payroll.services;

import com.marcelo.hr_payroll.entities.Payment;
import com.marcelo.hr_payroll.entities.Worker;
import com.marcelo.hr_payroll.feingClients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

//    @Value("${hr-worker.host}")
//    private String workerHost;

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days) {
        Worker worker = this.workerFeignClient.listWorker(workerId).getBody();

        Payment payment = new Payment(worker.getName(), worker.getDailyIncome(), days);
        return payment;
    }
}
