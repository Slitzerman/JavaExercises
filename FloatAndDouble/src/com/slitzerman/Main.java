package com.slitzerman;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5 / 3;
	    float myFloatValue = (float)5 / 3;
	    float orFloatValue = 5.4f;
	    double myDoubleValue = 324d / 3d;
	    System.out.println("Int " + myIntValue);
        System.out.println("Float " + myFloatValue);
        System.out.println("Double " + myDoubleValue);

        double pounds = myDoubleValue;
        double kilos = pounds * 0.45359237;

		System.out.println("result " + kilos);
    }
}
