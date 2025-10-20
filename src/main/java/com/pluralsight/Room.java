package com.pluralsight;

public class Room {
    private int beds;
    private double price;
    private boolean occupancy;
    private boolean dirty;

    public int getBeds() {
        return beds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupancy() {
        return occupancy;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !isDirty() && !isOccupancy();
    }

    public Room(int beds, double price, boolean occupancy, boolean dirty) {
        this.beds = beds;
        this.price = price;
        this.occupancy = occupancy;
        this.dirty = dirty;
    }
}
