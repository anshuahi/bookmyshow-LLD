package com.anshuahi.models;

import java.util.Date;

public class Payment extends BaseModel{

    private PaymentMethod paymentMethod;
    private Date timeOfPayment;
    private double amount;
    private String referenceId;

    private PaymentStatus paymentStatus;
    private Ticket ticket;
}
