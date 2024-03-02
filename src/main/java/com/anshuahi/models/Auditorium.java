package com.anshuahi.models;

import java.util.List;

//Screen
public class Auditorium extends BaseModel{
    private String name;
    private List<Seat> seats;   //OneToMany
    private List<Feature> auditoriumFeatures;   //ManyToMany
}

