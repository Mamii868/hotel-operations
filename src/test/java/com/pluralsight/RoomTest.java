package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_markRoomDirty() {
        Room room = new Room(2, 125.00, false, false);

        room.checkIn();

        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_should_markRoomOccupied() {
        Room room = new Room(2, 125.00, false, false);

        room.checkIn();

        assertTrue(room.isOccupied());
    }

    @Test
    public void checkOut_should_markRoomClean() {
        Room room = new Room(2, 125.00, false, false);

        room.checkIn();
        room.checkOut();

        assertFalse(room.isDirty());
    }

    @Test
    public void checkOut_should_markRoomNotOccupied() {
        Room room = new Room(2, 125.00, false, false);

        room.checkIn();
        room.checkOut();

        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom_should_failIfOccupied() {
        Room room = new Room(2, 125.00, false, false);

        room.checkIn();
        room.cleanRoom();

        assertTrue(room.isDirty());
    }

    @Test
    public void isAvailable_should_returnFalseIfOccupiedOrDirty() {
        Room room = new Room(2, 125.00, false, false);

        room.checkIn();

        assertFalse(room.isAvailable());
    }
}