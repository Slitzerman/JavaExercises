package com.slitzerman;

/**
 * Created by Rectormentis on 3.1.2017.
 */
public class ElectricCar extends Car {

    private double batteryCapacity;
    private double currentCharge;

    public ElectricCar(String engine, char gearbox, double wheelPosition, double speed, String model, int gear, double batteryCapacity, double currentCharge) {
        super(engine, gearbox, wheelPosition, speed, model, gear);
        this.batteryCapacity = batteryCapacity;
        this.currentCharge = currentCharge;
    }

    public ElectricCar(String engine, char gearbox, String model, double batteryCapacity) {
        this(engine, gearbox, 0, 0, model, 0, batteryCapacity, batteryCapacity );
    }

    public ElectricCar(String engine, char gearbox, String model) {
        this(engine, gearbox, 0, 0, model, 0, 0, 0);

    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void modBatteryCapacity(double modValue) {
        this.batteryCapacity += modValue;
        System.out.println("Electric car battery charge changed by: " + modValue);
    }

    @Override
    public void accelerate(double acc){
        super.accelerate(acc);
        System.out.println("Electric car changed speed by: " + acc);
    }
}
