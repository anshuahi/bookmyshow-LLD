package com.anshuahi.dto;

import com.anshuahi.models.Ticket;

public class BookTicketResponseDto {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public BookTicketResponseDto(){}

    public BookTicketResponseDto(Ticket ticket){
        this.ticket = ticket;
    }
}
