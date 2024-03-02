package com.anshuahi.models;

import java.util.List;

public class Theatre extends BaseModel {
    private String name;
    private String address;

    private List<Auditorium> auditoriums;

    private City city;
}
