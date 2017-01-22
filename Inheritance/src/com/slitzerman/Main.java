package com.slitzerman;

public class Main {

    public static void main(String[] args) {

        Vehicle anyVehicle = new Vehicle("diesel", 'a');

        Car bmw = new Car("gasoline", '5', "2017");

        ElectricCar sleekTesla = new ElectricCar("electric", '7', "AC++2017", 100.0);

        System.out.println("Created a Vehicle with:");
        System.out.println(anyVehicle.getEngine() + " Engine, " + anyVehicle.getGearbox() + " Gearbox");

        System.out.println("Created a Car with: ");
        System.out.println(bmw.getEngine() + " Engine, " + bmw.getModel() + " Model, " + bmw.getGearbox() + " Gears");

        System.out.println("Created an electric car with:");
        System.out.println(sleekTesla.getEngine() + " Engine, " + sleekTesla.getGearbox() + " Gears ");
        System.out.println("and model " + sleekTesla.getModel() + " with " + sleekTesla.getBatteryCapacity() + " battery");

        System.out.println("");

//        anyVehicle.accelerate(5);

//        bmw.changeGear(2);

        System.out.println("Electric car has speed: " + sleekTesla.getSpeed());
        sleekTesla.accelerate(40);
        System.out.println("Electric car has new speed of: " + sleekTesla.getSpeed());
//        sleekTesla.modBatteryCapacity(20.5);
//        sleekTesla.changeGear(4);

    }
}
