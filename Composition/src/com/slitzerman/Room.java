package com.slitzerman;

/**
 * Created by Rectormentis on 7.1.2017.
 */
public class Room {

    private Furniture furniture1;
    private Furniture furniture2;
    private String name;
    // normally would use an array or a list for these


    public Room(String name, Furniture furniture1, Furniture furniture2) {
        this.name = name;
        this.furniture1 = furniture1;
        this.furniture2 = furniture2;
    }

    public void describeRoom() {
        System.out.println("In " + name + " there is: " + this.furniture1.getName());
        System.out.println("In " + name + " there is: " + this.furniture2.getName());
    }

    public String getName() {
        return name;
    }
}
