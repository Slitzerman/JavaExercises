package com.slitzerman;

/**
 * Created by Rectormentis on 7.1.2017.
 */
public class Furniture {

    private String name;
    private String type;
    private String location = "";

    public Furniture(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void stealFurniture(){
        this.location = "not in the house";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
