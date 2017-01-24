package com.slitzerman;

public class Main {

    public static int[] getIntegers(int number){
        int arr[] = new int[number];

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
        int index = 0;
        int subject = 0;
        for(int i=0; i < arr.length; i++){
            subject = arr[i];
            int temp = -1;
            for(int j=0; j < arr.length; j++){
                if(subject < arr[j]) {
                    if(!isInArray(doneInts, j)){
                        subject = arr[j];
                        temp = j;
                    }
                    else
                        {
                        if(j == arr.length-1){
                            subject = arr[j];
                            doneInts[index] = j;
                        }
                    }
                }
            }
            doneInts[index] = temp;
            sorted[index] = subject;
            index++;
        }


        return sorted;
    }

    public static boolean isInArray(int[] arr, int num){
        for(int i=0; i < arr.length; i++){
           if(arr[i] == num){
               return true;
           }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] testArray = {0, 1, 5, 10, 3, 7};

        printArray(sortIntegers(testArray));
    }
}
