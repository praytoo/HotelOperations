package com.pluralsight;

public class Reservation {
    private String roomType;
    private int nrNights;
    private boolean weekend;

    public String getRoomType() {
        roomType = "king";
        roomType = "double";
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if (roomType.equals("king")) {
            double king = 139.00;
        } else if (roomType.equals("double")) {
            double dbl = 124.00;
        }
        return getPrice();
    }

    public int getNrNights() {
        return nrNights;
    }

    public void setNrNights(int nrNights) {
        this.nrNights = nrNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal(){
        if (roomType.equals("king")) {
            double price = 139.00 * nrNights;
        }else if (roomType.equals("double")) {
            double price2 = 124.00 * nrNights;
        }else if (weekend && roomType.equals("king")){
            double price3 = (139.00 * nrNights) * .1;
        }else if (weekend && roomType.equals("double")){
            double price4 = (124.00 * nrNights) * .1;
        }
        return getReservationTotal();
    }
}
