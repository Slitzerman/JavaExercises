package com.slitzerman;

/**
 * Created by Niko Pinnis on 2.1.2017.
 */
public class BankAccount {

    private int accountNumber;
    private String customerName;
    private double balance;
    private int phoneNumber;
    private String email;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("Deposited : " + amount);
        System.out.println("Balance is now: " + this.balance);
    }

    public boolean withdrawFunds(double amount) {
        if(this.balance - amount < 0 ) {
            System.out.println("Error, amount is higher than remaining balance!");
            System.out.println("Balance is now: " + this.balance);
            return false;

        }
        else{
            this.balance -= amount;
            System.out.println("Withdrew " + amount);
            System.out.println("Balance is now: " + this.balance);
            return true;
        }
    }

}
