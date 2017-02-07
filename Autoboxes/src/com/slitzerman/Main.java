package com.slitzerman;

public class Main {

    public static void main(String[] args) {

        String bankname = "Too big to fail";
        String na = "American branch";
        String c1 = "rich fella";
        String c2 = "not so rich guy";
        String c3 = "hipster";
        String c4 = "hippie";
        String c5 = "hobo";



        Bank greedyBank = new Bank(bankname);
        System.out.println("Founded new bank named: "+ greedyBank.getName());


        greedyBank.createBranch(na);
        System.out.println("Opened "+na+" for "+greedyBank.getName());

        System.out.println("Adding customers...");
        greedyBank.getBranch(na).addCustomer(new Customer(c1), 1000000);
        greedyBank.getBranch(na).addCustomer(new Customer(c2), 100);


        System.out.println(greedyBank.getName()+" has in the "+na+ " the following customers:");
        greedyBank.printCustomers(na, false);

        System.out.println("Customers make transactions...");
        greedyBank.getBranch(na).transactionInBranch(c1, -5000);
        greedyBank.getBranch(na).transactionInBranch(c2, 50);
        greedyBank.getBranch(na).transactionInBranch(c2, -5);
        greedyBank.getBranch(na).addCustomer(new Customer(c3), 3000);
        greedyBank.getBranch(na).transactionInBranch(c3, -100);

        System.out.println(greedyBank.getName()+" has in the "+na+ " the following transactions");
        greedyBank.printCustomers(na, true);


    }
}
