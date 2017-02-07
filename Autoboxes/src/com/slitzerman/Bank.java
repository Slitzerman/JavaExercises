package com.slitzerman;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Niko Pinnis on 8.2.2017
 * for project: Autoboxes.
 */
public class Bank {

    private String name;

    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public void createBranch(String name){
        branches.add(new Branch(name));
    }

    public Branch getBranch(String name){
        for (Branch b: branches
             ) {
            if(b.getBranchname().equals(name)){
                return b;
            }
        }

        return null;
    }

    public boolean printCustomers(String bName, boolean transactions){

        Branch branch = this.getBranch(bName);
        if(branch != null){
            if(branch.getCustomers().size()>0) {
                for (Customer c : branch.getCustomers()
                        ) {
                    System.out.println("Customer: " + c.getName());
                    if (transactions) {
                        System.out.println("Transactions for " + c.getName());
                        if (c.getTransactions().size() > 0) {
                            for (Double d : c.getTransactions()
                                    ) {
                                System.out.println(d);
                            }
                        } else System.out.println("No recorded transactions for " + c.getName());
                    }
                }
            }
            else System.out.println("This branch has no customers.");
            return true;
        }


        return false;
    }

    public String getName() {
        return name;
    }

    public void runBank(){
        String temp = "";
        boolean cont = true;
        Branch active = branches.get(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to: "+this.name);
        System.out.println("This bank has "+branches.size()+ " branches");
        while (branches.size()==0){
            sc.nextLine();
            System.out.print("Enter a name for the first branch: ");
            temp = sc.nextLine();
            if(temp.length()>0){
                createBranch(temp);
                System.out.println("Created a new branch named: "+temp);
            }
            else {
                System.out.println("Please give a valid name for a branch.");
                temp = "";
            }
        }
        while (cont){
            int choice = 0;
            sc.nextLine();
            System.out.println("Active branch: "+active.getBranchname());
            System.out.println("Choose an option");
            System.out.println("1. to add a customer");
            System.out.println("2 to add a transaction for a customer");
            System.out.println("3. to print all customers for a branch.");
            System.out.println("4. same as above with transactions included.");
            System.out.println("5. to create a new branch.");
            System.out.println("6. to switch to another branch.");
            System.out.print("Option");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    sc.nextLine();
                    System.out.print("Enter customer name: ");
                    temp = sc.nextLine();
                    //TODO: fix the branch selection
                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                default:

                    break;
            }
        }




    }



}
