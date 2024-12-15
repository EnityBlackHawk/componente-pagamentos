package com.example.componentepagamentos.service;

import com.example.componentepagamentos.dto.PaymentDto;
import com.example.componentepagamentos.model.Payment;
import com.example.componentepagamentos.repository.PaymentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    private final PaymentRepository paymentRepository;
    private final AmqpTemplate amqpTemplate;

    public PaymentService(PaymentRepository paymentRepository, @Qualifier("rabbitTemplate") AmqpTemplate amqpTemplate) {
        this.paymentRepository = paymentRepository;
        this.amqpTemplate = amqpTemplate;
    }


    public Payment createPayment(PaymentDto dto) {
        ModelMapper mm = new ModelMapper();
        Payment payment = mm.map(dto, Payment.class);
        return paymentRepository.save(payment);
    }

    @RabbitListener(queues = {"pag-req-cred"})
    public void processPayment(PaymentDto payment)
    {
        System.out.println("Processing paymento of order: " + payment.getId());
        Payment result = createPayment(payment);
        amqpTemplate.convertAndSend("pag-exchange", "pag.res", result);
    }

}
