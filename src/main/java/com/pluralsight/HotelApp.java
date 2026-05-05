package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) throws InterruptedException {
        Room room = new Room(4, 128.00, true, false);

        Reservation reservation = new Reservation("King", 6, false);

        System.out.println(room.isAvailable());
        System.out.printf("$%.2f", reservation.getReservationTotal());
        System.out.println();

        Employee employee = new Employee(2, "Marc", "Service", 22.00);
        employee.punchIn();
        Thread.sleep(4000);
        employee.punchOut();
    }
}
