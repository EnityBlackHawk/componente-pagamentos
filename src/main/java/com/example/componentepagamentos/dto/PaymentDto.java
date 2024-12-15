package com.example.componentepagamentos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {

    private String id;
    private UUID orderId;
    private String cardNumber;
    private Integer cvv;
    private String expirationDate;

}