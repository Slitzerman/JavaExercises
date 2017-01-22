package com.slitzerman;

class Car {

    private boolean hasEngine = true;
    private boolean engineIsOn = false;
    private int cylinders;
    private int wheels = 4;
    private int speed = 0;

    private String name;

    public Car(boolean hasEngine, int cylinders, int wheels, String name) {
        this.hasEngine = hasEngine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.name = name;
    }

    public Car(boolean hasEngine, int cylinders, String name) {
        this.hasEngine = hasEngine;
        this.cylinders = cylinders;
        this.name = name;
    }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setEngineOn(boolean engineIsOn) {
        this.engineIsOn = engineIsOn;
    }

    public boolean getEngineOn() {
        return engineIsOn;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isEngineOn() {
        System.out.println("Cars engine is on.");
        return this.engineIsOn;
    }

    public void startEngine(){
        this.engineIsOn = true;
        System.out.println("Cars engine turned on.");
    }

    public void accelerate(int acc){
        this.speed += acc;
        System.out.println("Car accelerated: " + acc + " units.");
    }

    public void brake(int dec){
        this.speed -= dec;
        System.out.println("Car decelerated: " + dec + " units.");
    }

}

class Talbot extends Car {

    public Talbot(int cylinders, String name) {
        super(cylinders, name);
    }
    public boolean isEngineOn() {
        System.out.println("Talbots engine is on.");
//        return super.isEngineOn();
        return this.getEngineOn();
    }

    public void startEngine(){
        this.setEngineOn(true);
        System.out.println("Talbots engine turned on.");
    }

    public void accelerate(int acc){
        int newSpeed = this.getSpeed() + acc;
        this.setSpeed(newSpeed);
        System.out.println("Talbot " + this.getName() + " accelerated: " + acc + " units.");
    }

    public void brake(int dec){
        int newSpeed = this.getSpeed() - dec;
        this.setSpeed(newSpeed);
        System.out.println("Talbot decelerated: " + dec + " units.");
    }

}


class Toyota extends Car {
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }
    public boolean isEngineOn() {
        System.out.println("Toyotas engine is on.");
        return this.getEngineOn();
    }

    public void startEngine(){
        this.setEngineOn(true);
        System.out.println("Toyotas engine turned on.");
    }

    public void accelerate(int acc){
        int newSpeed = this.getSpeed() + acc;
        this.setSpeed(newSpeed);
        System.out.println("Toyota " + this.getName() + " accelerated: " + acc + " units.");
    }

    public void brake(int dec){
        int newSpeed = this.getSpeed() - dec;
        this.setSpeed(newSpeed);
        System.out.println("Toyota decelerated: " + dec + " units.");
    }
}

class Peugeot extends Car {
    public Peugeot(int cylinders, String name) {
        super(cylinders, name);
    }
    public boolean isEngineOn() {
        System.out.println("Peugeots engine is on.");
        return this.getEngineOn();
    }

    public void startEngine(){
        this.setEngineOn(true);
        System.out.println("Peugeots engine turned on.");
    }

    public void accelerate(int acc){
        int newSpeed = this.getSpeed() + acc;
        this.setSpeed(newSpeed);
        System.out.println("Peugeot " + this.getName() + " accelerated: " + acc + " units.");
    }

    public void brake(int dec){
        int newSpeed = this.getSpeed() - dec;
        this.setSpeed(newSpeed);
        System.out.println("Peugeot decelerated: " + dec + " units.");
    }
}
public class Main {


    public static void main(String[] args) {
	// write your code here

        for (int i = 0; i < 5; i++ ){
            Car myRide;
            switch ((int)(Math.random() * 4 + 1 )){

                case 1:
                    myRide = new Talbot(4, "Horizon");
                    carAction(myRide);
                    break;
                case 2:
                    myRide = new Toyota(4, "Yaris");
                    carAction(myRide);
                case 3:
                    myRide = new Peugeot(4, "307");
                    carAction(myRide);

                default:
                    myRide = new Car(10, "Master Vehicle");
                    carAction(myRide);
                    break;
            }

        }

    }

    public static void carAction(Car car){
        car.startEngine();
        car.accelerate(100);

        System.out.println(car.getName() + " has speed: " + car.getSpeed());

        car.brake(100);
        System.out.println(car.getName() + " has speed: " + car.getSpeed());

        System.out.println("");
    }

}
