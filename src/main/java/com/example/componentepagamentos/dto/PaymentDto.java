package com.example.componentepagamentos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {

    private String id;
    private String orderId;
    private String cardNumber;
    private Integer cvv;
    private String expirationDate;
    private Double value;
    private Date paymentDate = new Date();

}