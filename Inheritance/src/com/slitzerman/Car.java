package com.slitzerman;

/**
 * Created by slitzerman on 3.1.2017.
 */
public class Car extends Vehicle {

    private String model;
    private int gear;

    public Car(String engine, char gearbox, double wheelPosition, double speed, String model, int gear) {
        super(engine, gearbox, wheelPosition, speed);
        this.model = model;
        this.gear = gear;
    }

    public Car(String engine, char gearbox, String model, int gear) {
        super(engine, gearbox);
        this.model = model;
        this.gear = gear;
    }

    public Car(String engine, char gearbox, String model) {
        this(engine, gearbox, model, 0);
    }

    public String getModel() {
        return model;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear(int gearSwitch) {
        this.gear = gearSwitch;
        System.out.println("Car switched gear by : " + gearSwitch);
    }

    @Override
    public void accelerate(double acc){
        super.accelerate(acc);
        System.out.println("Car changed speed by: " + acc);
    }
}
