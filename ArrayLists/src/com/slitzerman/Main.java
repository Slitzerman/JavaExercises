package com.slitzerman;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone(new ArrayList<Contact>());
//
//
//        phone.newContact("Duke Nukem", "555-death");
//        phone.newContact("Brock Stoner", "555-stoned");
//        phone.newContact("John Smith", "555-5555");
//
//        System.out.println("phone has the following contacts:");
//        phone.printContacts();
//
//
//
////        System.out.println(phone.getByPhone("555-death").getContact());
//
//        System.out.println("Changing...");
//        System.out.println(phone.getByName("John Smith").getContact());
//        phone.modidyContact(phone.getByName("John Smith"), new Contact("John Smithereens", "555-nuked"));
//        System.out.println("To...");
//        System.out.println(phone.getByName("John Smithereens").getContact());
//
//        System.out.println("Phone now has the following contacts:");
//        phone.printContacts();

        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        while(cont) {
            cont = phone.openMenu();

        }
    }
}
