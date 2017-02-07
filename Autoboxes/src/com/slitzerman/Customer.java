package com.slitzerman;

import java.util.ArrayList;

/**
 * Created by Niko Pinnis on 8.2.2017
 * for project: Autoboxes.
 */
public class Customer {

    private String name;
    private double balance;

    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    public void doTransaction(double amount){
        transactions.add(amount);
        balance += amount;
    }

    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
