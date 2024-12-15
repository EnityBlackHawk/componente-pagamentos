package com.example.componentepagamentos;

import com.example.componentepagamentos.model.Payment;
import com.example.componentepagamentos.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComponentePagamentosApplication {


    public static void main(String[] args) {
        SpringApplication.run(ComponentePagamentosApplication.class, args);
    }

}
