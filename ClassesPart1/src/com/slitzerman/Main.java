package com.slitzerman;

public class Main {

    public static void main(String[] args) {

        BankAccount customer1 = new BankAccount();

        customer1.setAccountNumber(1111);
        customer1.setBalance(0);
        customer1.setCustomerName("Poor Hippie");
        customer1.setEmail("poor.hippie@treehugger.forest");
        customer1.setPhoneNumber(987654321);

        customer1.depositFunds(100);
        customer1.depositFunds(15);
        customer1.withdrawFunds(80);
        customer1.withdrawFunds(10000);


        VipCustomer richguy1 = new VipCustomer();


        VipCustomer richguy2 = new VipCustomer("Rich", "Rich@money.au");


        VipCustomer richguy3 = new VipCustomer("Rich", 1000000000.00, "Rich@money.au");



    }
}
