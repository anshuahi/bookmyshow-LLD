package com.anshuahi.models;

import java.util.Date;
import java.util.List;

public class Show {
    private Movie movie;    //ManyToOne
    private Date startTime;
    private Date endTime;

    private Auditorium auditorium;  //ManyToOne

    private List<Feature> showFeatures;     //ManyToMany
}
