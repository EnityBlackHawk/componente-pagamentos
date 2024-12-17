package com.example.componentepagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Payment {

    @Id
    private String id;
    private String orderId;
    private String cardNumber;
    private String expirationDate;
    private Date paymentDate = new Date();
    private Double value;

}