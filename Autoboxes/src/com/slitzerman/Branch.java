package com.slitzerman;

import java.util.ArrayList;

/**
 * Created by Niko Pinnis on 8.2.2017
 * for project: Autoboxes.
 */
public class Branch {

    private String branchname;

    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchname) {
        this.branchname = branchname;
    }

    public void addCustomer(Customer c, double d){
        c.doTransaction(d);
        customers.add(c);

    }

    public boolean transactionInBranch(String name, double d){

        for (Customer c:customers
             ) {
            if(c.getName().equals(name)){
                c.doTransaction(d);
                return true;
            }
        }

        return false;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;

    }

    public String getBranchname() {
        return branchname;
    }
}
