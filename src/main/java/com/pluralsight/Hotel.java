package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRoomes;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRoomes = 0;
    }

    public Hotel(int bookedSuites, int bookedBasicRoomes) {
        this.numberOfSuites = 0;
        this.numberOfRooms = 0;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRoomes = bookedBasicRoomes;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (this.numberOfSuites - this.bookedSuites >= numberOfRooms) {
                this.bookedSuites += numberOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            if (this.numberOfRooms - this.bookedBasicRoomes >= numberOfRooms) {
                this.bookedBasicRoomes += numberOfRooms;
                return true;
            } else {
                return false;
            }
        }
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRoomes;
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }
}
