package com.slitzerman;

public class Main {

    public static void main(String[] args) {

//        System.out.println(isEveNumber(7));
        int currentNumber = 1;
        int finalNumber = 199;
        int totalEvenNumbers = 0;
        int maxEvenNumbers = 100;

        while(totalEvenNumbers < maxEvenNumbers && currentNumber <= finalNumber){
            if(isEveNumber(currentNumber)) totalEvenNumbers++;
            currentNumber++;
        }

        System.out.println("Found " + totalEvenNumbers + " even numbers.");

    }

    public static boolean isEveNumber(int num){
        return num % 2 == 0;
//        if(num % 2 == 0) return true;
//        return false;
    }
}
