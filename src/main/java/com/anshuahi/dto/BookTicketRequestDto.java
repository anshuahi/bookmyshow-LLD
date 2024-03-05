package com.anshuahi.dto;

import com.anshuahi.models.ShowSeat;

import java.util.List;

// data transfer object
public class BookTicketRequestDto {
    private long showId;
    private long userId;
    private List<ShowSeat> showSeatIds;

}
