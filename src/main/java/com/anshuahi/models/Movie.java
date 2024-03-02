package com.anshuahi.models;

import java.util.List;

public class Movie extends BaseModel{
    private String name;
    private List<Actor> actors;             //ManyToMany
    private List<Feature> movieFeatures;    //ManyToMany
    private List<Genre> genre;              //ManyToMany

}
