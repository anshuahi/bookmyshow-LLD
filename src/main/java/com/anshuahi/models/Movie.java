package com.anshuahi.models;

import java.util.List;

public class Movie extends BaseModel{
    private String name;
    private List<Actor> actors;
    private List<Feature> movieFeatures;
    private List<Genre> genre;

}
