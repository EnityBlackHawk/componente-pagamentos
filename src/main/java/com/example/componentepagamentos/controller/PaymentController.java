package com.example.componentepagamentos.controller;

import com.example.componentepagamentos.dto.PaymentDto;
import com.example.componentepagamentos.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/{id}")
    public PaymentDto getById(@PathVariable String id) {
        return paymentService.getById(id);
    }

    @GetMapping("/order/{orderId}")
    public PaymentDto getByOrderId(@PathVariable String orderId) {
        return paymentService.getByOrderId(orderId);
    }
}
