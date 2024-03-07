package com.anshuahi.dto;

import com.anshuahi.models.ShowSeat;

import java.util.List;

// data transfer object
public class BookTicketRequestDto {
    private Long showId;
    private Long userId;
    private List<Long> showSeatIds;

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getShowSeatIds() {
        return showSeatIds;
    }

    public void setShowSeatIds(List<Long> showSeatIds) {
        this.showSeatIds = showSeatIds;
    }
}
