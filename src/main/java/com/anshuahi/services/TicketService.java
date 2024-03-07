package com.anshuahi.services;

import com.anshuahi.exceptions.UserNotFoundException;
import com.anshuahi.models.*;
import com.anshuahi.repositories.ShowSeatRepository;
import com.anshuahi.exceptions.ShowSeatNotFoundException;
import com.anshuahi.repositories.UserRepository;

import java.util.List;

// @Service
public class TicketService {
    private ShowSeatRepository showSeatRepository;
    private UserRepository userRepository;

    TicketService(ShowSeatRepository showSeatRepository, UserRepository userRepository){
        this.showSeatRepository = showSeatRepository;
        this.userRepository = userRepository;
    }

    // @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Long> showSeatIds, Long userId, Long showId) throws ShowSeatNotFoundException, UserNotFoundException {

        // Steps:-
        // 1. fetch the showSeats from the list of showSeatsIds -> call findAllByIdIn without lock
        List<ShowSeat> showSeats = showSeatRepository.findAllByIdIn(showSeatIds);

        // 2. check the status of showSeats
        // 3. if any on them is not AVAILABLE then throw the exceptions
        for (ShowSeat showSeat : showSeats){
            if(!showSeat.getState().equals(ShowSeatState.AVAILABLE)){
                // throw an exception
                throw new ShowSeatNotFoundException(showSeat.getId());
            }
        }

        // 4. acquire the lock on the seats -> call findAllByIdIn with lock
        // 5. check the status of showSeats again.
        showSeats = showSeatRepository.findAllByIdIn(showSeatIds);  // WITH LOCK

        // CHECK the status again for the all the show seats.
        for (ShowSeat showSeat: showSeats){
            showSeat.setState(ShowSeatState.LOCKED);
            showSeatRepository.save(showSeat);  // showSeatRepository.saveAll((showSeats));
        }


        // 6. if all the seats are AVAILABLE, then generate the Ticket.

        Ticket ticket = new Ticket();
        User usr = userRepository.findById(userId);
        if(usr == null){
            throw new UserNotFoundException(userId);
            // return some error;
        }

        ticket.setBookedBy(usr);
        ticket.setTicketStatus(TicketStatus.PENDING);
        ticket.setShowSeats(showSeats);

        return ticket;
    }
}
