package com.slitzerman;

public class Main {

    public static void main(String[] args) {

        Furniture classyTable = new Furniture("Antique table", "table");

        Room bigLivingroom = new Room("cool Livingroom", classyTable, new Furniture("simple chair", "simple"));

        House awesomeHouse = new House("baddass house", bigLivingroom, new Room("boring kitchen", new Furniture("table", "table"),new Furniture( "kithen", "kithcen") ));

        System.out.println("Built house with the following:");

        System.out.println("One room is " + awesomeHouse.getRoom1().getName());
        System.out.println("Another room is: " + awesomeHouse.getRoom2().getName());

        awesomeHouse.getRoom1().describeRoom();
        awesomeHouse.getRoom2().describeRoom();



    }
}
