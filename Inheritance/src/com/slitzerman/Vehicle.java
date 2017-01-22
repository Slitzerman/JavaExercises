package com.slitzerman;

/**
 * Created by slitzerman on 3.1.2017.
 */
public class Vehicle {

    private double speed;
    private double wheelPosition; // left negative right positive
    private String Engine; // diesel, electric etc
    private char gearbox; // a or A for auto or number of gears

    public Vehicle(String engine, char gearbox, double wheelPosition, double speed) {
        this.speed = speed;
        this.wheelPosition = wheelPosition;
        this.Engine = engine;
        this.gearbox = gearbox;
    }

    public Vehicle(String engine, char gearbox) {
        this(engine, gearbox, 0, 0);
    }

    public double getSpeed() {
        return speed;
    }

    public char getGearbox() {
        return gearbox;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        this.Engine = engine;
    }

    public double getWheelPosition() {
        return wheelPosition;
    }

    public void steer(double angle){
        this.wheelPosition += angle;
        System.out.println("Vehicle wheel turned by: " + angle + " degrees");
    }

    public void accelerate(double acc) {
        this.speed += acc;
        System.out.println("Vehicle changed its speed by: " + acc);
    }
}
