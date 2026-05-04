package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        double price = 0;
        if (this.roomType.equalsIgnoreCase("king")) {
            price += 139;
        } else if (this.roomType.equalsIgnoreCase("double")) {
            price += 124;
        }
        if (this.isWeekend) {
            price *= 1.10;
        }
        return price;
    }

    public double getReservationTotal() {
        return getPrice() * this.numberOfNights;
    }
}
