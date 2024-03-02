package com.anshuahi.models;

import java.util.List;

//Screen
public class Auditorium extends BaseModel{
    private String name;

    //    one to Many
    private List<Seat> seats;
    private List<Feature> auditoriumFeatures;
}

