package com.anshuahi.models;

public class Seat extends BaseModel{

    private String name;
    private SeatType seatType;  //ManyToOne
    private int row;
    private int col;

    private SeatStatus seatStatus;  //ManyToOne
}
