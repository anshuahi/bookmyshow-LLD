package com.anshuahi.models;

public class ShowSeat extends BaseModel{
    private Show show;  // ManyToOne
    private Seat seat;  //ManyToOne
    private ShowSeatState state;    //ManyToOne
    private double price;
}
