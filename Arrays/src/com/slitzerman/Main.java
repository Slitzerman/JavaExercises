package com.slitzerman;

import java.util.Scanner;

public class Main {

    public static int[] getIntegers(int number){
        int arr[] = new int[number];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter " + number + " Integers:");
        for(int i= 0; i<arr.length; i++){

            arr[i] = scan.nextInt();
        }

        System.out.println("Integers received...");

        return arr;
    }

    public static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }


    public static int[] sortIntegers(int[] arr){
        int[] sorted = new int[arr.length];
        int[] doneInts = new int[arr.length];
        boolean finished = false;
        boolean shifted = false;
        int temp;
        System.out.println("Sorting Integers from largest to smallest...");
        while(!finished){
            shifted = false;
            for(int i=0; i < arr.length - 1; i++){
                if(arr[i]<arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    shifted = true;
                }

            }

            if(!shifted) finished = true;

        }

        System.out.println("Done!");
        return arr;
    }



    public static boolean isInArray(int[] arr, int num){
        System.out.println("Printing results...");
        for(int i=0; i < arr.length; i++){
           if(arr[i] == num){
               return true;
           }
        }
        return false;
    }


    public static void main(String[] args) {

//        int[] testArray = { 1, 5, 10, 3, 7, 11, 100, 45, 2, 3, 5};

        int arraySize = 10;
        int[] anArray = new int[arraySize];

        anArray = getIntegers(anArray.length);


        printArray(sortIntegers(anArray));

//        printArray(sortIntegers(testArray));
    }
}
