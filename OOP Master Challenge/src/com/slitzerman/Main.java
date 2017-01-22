package com.slitzerman;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bills burgers is now open!\n");

        Hamburger burger1 = new Hamburger("Burger","Standard", "cow");

//        System.out.println("Made burger with: " + burger1.getAddCount() + " additions priced for: " + burger1.totalPrice());

        burger1.addItem("tomato");
        burger1.addItem("lettuce");
        burger1.addItem("sauce");

        burger1.burgerDetails();

//        System.out.println("Burger now has " + burger1.getAddCount() + " additions priced for: " + burger1.totalPrice());

        Hamburger burger2 = new HealthyBurger("Chicken");

//        System.out.println("Made a Healthy burger with: " + burger2.getAddCount() + " additions priced for: " + burger2.totalPrice());

        burger2.addItem("lettuce", false);
        burger2.addItem("tomato", false);
        burger2.addItem("cucumber", false);
        burger2.addItem("some vegetable", false);
        burger2.addItem("and another vegetable", false);
        burger2.addItem("an extra", true);


        burger2.burgerDetails();
//
//        System.out.println("Healthy burger now has " + burger2.getAddCount() + " additions priced for: " + burger2.totalPrice());
//
        Hamburger burger3 = new DeluxeBurger("Beef");
//
//        System.out.println("Made a Deluxe burger with: " + burger3.getAddCount() + " additions priced for: " + burger3.totalPrice());
//
        burger3.addItem("sauce");
        burger3.addItem("pickle");
        burger3.addItem("mayo");
        burger3.addItem("drinks");
        burger3.addItem("extra meat", true);
        burger3.addItem("chips", true);

        burger3.burgerDetails();
//
//        System.out.println("Deluxe burger now has " + burger3.getAddCount() + " additions priced for: " + burger3.totalPrice());
//
//        burger3.addItem("more of the good stuff!");
//
//        System.out.println("Deluxe burger should still have " + burger3.getAddCount() + " additions priced for: " + burger3.totalPrice());
//
        burger2.setAdditionPrice(2.00);
//
        System.out.println("Government policies raised the price of additions for Healthy burger to: " + burger2.getAdditionPrice());
        System.out.println("Healthy burger now costs: " + burger2.totalPrice());
//
        burger3.setBasePrice(3.00);
//
        System.out.println("Increased demand raised the base price of Deluxe burger to: " + burger3.getBasePrice());
        System.out.println("Deluxe burger now costs: " + burger3.totalPrice());

//        System.out.println("");
//        System.out.println("burger 1 is:\n");
//        burger1.burgerDetails();
    }
}
