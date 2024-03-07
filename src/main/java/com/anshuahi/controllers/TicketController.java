package com.anshuahi.controllers;

import com.anshuahi.dto.BookTicketRequestDto;
import com.anshuahi.dto.BookTicketResponseDto;
import com.anshuahi.exceptions.ShowSeatNotFoundException;
import com.anshuahi.exceptions.UserNotFoundException;
import com.anshuahi.models.Ticket;
import com.anshuahi.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public BookTicketResponseDto bookTicket(BookTicketRequestDto bookTicketRequestDto) throws ShowSeatNotFoundException, UserNotFoundException {

        Ticket ticket =  ticketService.bookTicket(bookTicketRequestDto.getShowSeatIds(),
                bookTicketRequestDto.getUserId(), bookTicketRequestDto.getShowId());

        BookTicketResponseDto responseDto = new BookTicketResponseDto();
        responseDto.setTicket(ticket);
        return  responseDto;
    }
}
