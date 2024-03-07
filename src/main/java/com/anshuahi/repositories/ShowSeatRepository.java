package com.anshuahi.repositories;

import com.anshuahi.models.ShowSeat;

import java.util.List;

public interface ShowSeatRepository {
    ShowSeat findById(Long showSeatId);
    // select * from show_seat where id = showSeatId;

    // select * from show_seats where Id in (...) for update
     List<ShowSeat> findAllByIdIn(List<Long> showSeatIds);    // find and acquire the lock
    // select * from show_seat where id IN (4, 5, 6, 7);


//    List<ShowSeat> findAllByIdBetweenAndIdBetween(List<Long> showSeatIds);

//    List<ShowSeat> findShowSeatsBySeatIdIn();
    ShowSeat save(ShowSeat showSeat);   // UPSERT -> UPDATE + INSERT

    List<ShowSeat> saveAll(List<ShowSeat> showSeats);



}
