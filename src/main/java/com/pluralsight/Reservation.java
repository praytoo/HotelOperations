package com.pluralsight;

public class Reservation {
    private String roomType;
    private int nrNights;
    private boolean weekend;
    private double price;

    public Reservation(String roomType, int nrNights, boolean weekend) {
        this.roomType = roomType;
        this.nrNights = nrNights;
        this.weekend = weekend;

        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.price = 124.00;
        } else {
            this.price = 0.00;
        }
    }



    public String getRoomType() {
        roomType = "king";
        roomType = "double";
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
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
        double nightlyRate = price;

        if (this.weekend) {
            nightlyRate += nightlyRate * 0.10;
        }

        return nightlyRate * nrNights;
    }
}
