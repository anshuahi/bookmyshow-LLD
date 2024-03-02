package com.anshuahi.models;

import java.util.Date;

public class Payment extends BaseModel{

    private PaymentMethod paymentMethod;    //ManyToOne
    private Date timeOfPayment;
    private double amount;
    private String referenceId;

    private PaymentStatus paymentStatus;    //ManyToOne
    private Ticket ticket;                  //ManyToOne
}
