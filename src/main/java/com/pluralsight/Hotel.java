package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRoomsRequested, boolean isSuite) {
        if (isSuite) {
            if (numberOfSuites - bookedSuites >= numberOfRoomsRequested) {
                bookedSuites += numberOfRoomsRequested;
                return true;
            } else {
                return false;
            }
        }else {
            if (numberOfRooms - bookedBasicRooms >= numberOfRoomsRequested){
                bookedBasicRooms += numberOfRoomsRequested;
                return true;
            } else {
                return false;
            }
        }
    }

    public int getAvailableSuites(){
       int available = numberOfSuites - bookedSuites;
       return available;
    }

    public int getAvailableRooms(){
        int available = numberOfRooms - bookedBasicRooms;
        return available;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
}
