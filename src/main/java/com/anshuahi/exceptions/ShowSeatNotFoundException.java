package com.anshuahi.exceptions;

public class ShowSeatNotFoundException extends Exception{
    public ShowSeatNotFoundException(Long showSeatId){
        super("Show seat with id " + showSeatId + "isn't available");
    }
}
