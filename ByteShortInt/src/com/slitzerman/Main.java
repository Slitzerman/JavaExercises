package com.slitzerman;

public class Main {

    public static void main(String[] args) {

        // Integer 32
	    int myMinValue = -2_147_483_648;
	    int myMaxValue = 2_147_483_647;
	    int myTotal = (myMinValue/2);

	    // Byte 8
	    byte myByteValue = 10;
	    byte myNewBytevalue = (byte)(myByteValue/2);

	    // short 16
	    short myShortValue = 32767;

	    // Long 64
	    long myLongValue = 100L;

        byte aByte = 1;

        short aShort = 10;

        int aInt = 123456;

        long aLong = 50000 + 10 * (aByte + aShort + aInt);
        System.out.println("aLong: " + aLong);

    }
}
