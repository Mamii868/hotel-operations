package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_markRoomDirtyAndOccupied() {
        Room room = new Room(2, 125.00, false, false);

        room.checkIn();

        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
    }

    @Test
    public void checkOut_should_markRoomCleanAndNotOccupied() {
        Room room = new Room(2, 125.00, false, false);

        room.checkIn();
        room.checkOut();

        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
    }

    @Test
    public void cleanRoom_should_failIfOccupied() {
        Room room = new Room(2, 125.00, false, false);

        room.checkIn();
        room.cleanRoom();

        assertTrue(room.isDirty());
    }
}