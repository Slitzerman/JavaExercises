package com.slitzerman;

public class Main {

    public static void main(String[] args) {

        int amount = 10000;
        for(int i=2; i<9; i++){
            System.out.println(amount +  " at " + i + "% interest rate is: "
                    + String.format("%.2f",calculateInterest(amount, i)));
        }

        System.out.print("\n");

        for(int i=8; i>1; i--){
            System.out.println(amount +  " at " + i + "% interest rate is: "
                    + String.format("%.2f",calculateInterest(amount, i)));
        }

        int primesFound = 0;
        for(int i=100;i<10000;i++) {

            if (isPrime((i))) {
                System.out.println("Found prime number " + i);
                primesFound++;
            }
            if (primesFound == 3) break;

        }


    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);

    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i <= n/2; i++){
            if(n % i== 0 ){
                return false;
            }
        }

        return true;
    }
}
