package com.slitzerman;

public class Main {

    public static void main(String[] args) {
        double myFeet = 8;
        double myInches = 4;

        System.out.println(myFeet + " feet and " + myInches + " inches are " +
                calcFeetAndInchesToCentimeters(myFeet, myInches) + " centimeters");

        System.out.println(myInches + " inches are " + calcFeetAndInchesToCentimeters(myInches) + " centimeters");

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
            if(feet < 0|| inches < 0 || inches >= 12) {
                return -1;
            }
            else {
                return (feet * 12 + inches) * 2.54;
            }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) return inches * 2.54;
        return -1;
    }
}
