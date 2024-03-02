package com.anshuahi.models;

public class ShowSeatType extends BaseModel {
    private Show show;  //ManyToOne
    private SeatType seatType;  //ManyToOne
    private double price;
}
