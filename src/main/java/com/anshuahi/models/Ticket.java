package com.anshuahi.models;

import java.util.Date;
import java.util.List;

public class Ticket extends BaseModel {
    private User bookedBy;  //ManyToOne
    private Show show;  //ManyToOne

    private List<ShowSeat> showSeats;   //ManyToMany
    private double totalAmount;

    private TicketStatus ticketStatus;  //ManyToOne
    private Date timeOfBooking;

    private List<Payment> payments;     //OneToMany
}
