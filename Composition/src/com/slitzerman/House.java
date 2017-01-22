package com.slitzerman;

/**
 * Created by Rectormentis on 7.1.2017.
 */
public class House {

    private Room room1;
    private Room room2;
    private String name;

    public House(String name, Room room1, Room room2) {
        this.name = name;
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room getRoom1() {
        return room1;
    }

    public Room getRoom2() {
        return room2;
    }
}
