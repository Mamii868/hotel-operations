package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) throws InterruptedException {
//        Room room = new Room(4, 128.00, true, false);
//
//        Reservation reservation = new Reservation("King", 6, false);
//
//        System.out.println(room.isAvailable());
//        System.out.printf("$%.2f", reservation.getReservationTotal());
//        System.out.println();
//
//        Employee employee = new Employee(2, "Marc", "Service", 22.00);
//        employee.punchIn();
//        Thread.sleep(4000);
//        employee.punchOut();

        Hotel hotel = new Hotel("Marc's Hotel", 4, 16);

        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
        System.out.println("Available Suites: " + hotel.getAvailableSuites());

        Thread.sleep(2000);
        System.out.println("Booked 2 Rooms: " + hotel.bookRoom(2, false));
        System.out.println("Booked 6 Suites: " + hotel.bookRoom(6, true));

        Thread.sleep(2000);
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
    }
}
