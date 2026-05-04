package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {
        Room room = new Room(4, 128.00, true, false);

        Reservation reservation = new Reservation("King", 6, false);

        System.out.println(room.isAvailable());
        System.out.printf("$%.2f", reservation.getReservationTotal());

    }
}
