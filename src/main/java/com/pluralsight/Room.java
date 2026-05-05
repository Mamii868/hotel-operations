package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !this.isOccupied && !this.isDirty;
    }

    public void checkIn() {
        if (this.isAvailable()) {
            this.isDirty = true;
            this.isOccupied = true;
            System.out.println("Guest is checked in!");
        } else if (this.isDirty && !this.isOccupied) {
            System.out.println("Room is still dirty!");
        } else if (this.isOccupied) {
            System.out.println("Room is occupied!");
        }
    }

    public void checkOut() {
//        Occupied rooms will always be dirty so no need to check for it
        if (this.isOccupied()) {
            this.isOccupied = false;
            System.out.println("Guest Checked out!");
            cleanRoom();
        } else {
            System.out.println("Guest already checked out!");
        }
    }

    public void cleanRoom() {
        if (!this.isOccupied()) {
            this.isDirty = false;
            System.out.println("Room has been cleaned!");
        } else {
            System.out.println("Room is still occupied!");
        }
    }

}
