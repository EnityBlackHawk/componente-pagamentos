package com.example.componentepagamentos.service;

import com.example.componentepagamentos.model.Payment;
import com.example.componentepagamentos.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment createPayment(Payment payment) {

        return paymentRepository.save(payment);
    }


}
