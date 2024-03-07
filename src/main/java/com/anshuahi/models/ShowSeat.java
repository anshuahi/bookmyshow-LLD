package com.anshuahi.models;

// show_seat_mapping
public class ShowSeat extends BaseModel{
    private Show show;  // ManyToOne
    private Seat seat;  //ManyToOne
    private ShowSeatState state;    //ManyToOne
    private double price;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public ShowSeatState getState() {
        return state;
    }

    public void setState(ShowSeatState state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
