package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_ifNotOccupied() {
        //arrange
        Room room = new Room(5, 139.00, false, false);
        boolean expectedOccupied = true;

        //act
        room.checkIn();

        //assert
        assertEquals(expectedOccupied, room.isOccupancy());
    }

    @Test
    void checkOut_IfDirty() {
        //arrange
        Room room = new Room(5, 139.00, false, false);
        boolean expectedDirty = true;
        room.checkIn();

        //act
        room.checkOut();

        //assert
        assertEquals(expectedDirty, room.isDirty());
    }

    @Test
    void cleanRoom_ifNotOccupied() {
        //arrange
        Room room = new Room(5, 139.00, false, false);
        room.checkIn();
        room.checkOut();

        //act
        room.cleanRoom();

        //assert
        assertFalse(room.isDirty());
    }
}
