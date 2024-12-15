package com.example.componentepagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Payment {

    @Id
    private String orderId;
    private String cardNumber;
    private Integer cvv;
    private String expirationDate;

}