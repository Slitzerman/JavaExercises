package com.slitzerman;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Niko Pinnis on 1.2.2017
 * for project: ArrayLists.
 */
public class MobilePhone {

    private ArrayList<Contact> contacts;

    public MobilePhone(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    private void newContact(String name, String phone){

        contacts.add(new Contact(name, phone));

    }

    private void removeContact(String name) {
        if(hasContact(name)) contacts.remove(contacts.indexOf(getByName(name)));

    }

    private Contact getByName(String name){

        for(int i=0;i<this.contacts.size();i++){
            if(this.contacts.get(i).getName().equals(name)){
                return this.contacts.get(i);
            }
        }
        return null;

    }

    private Contact getByPhone(String phone){

        for(int i=0;i<this.contacts.size();i++){
            if(this.contacts.get(i).getPhone().equals(phone)){
                return this.contacts.get(i);
            }
        }
        return null;

    }

    private void modifyContact(Contact old, Contact newc){
        this.contacts.set(this.contacts.indexOf(old), newc);
        System.out.println("Updated: " + old.getContact());
        System.out.println("To: " + newc.getContact());

    }

    private void printContacts(){
        System.out.println("Displaying contacts:");
        for(int i=0;i<this.contacts.size();i++) {
            System.out.println(this.contacts.get(i).getContact());
        }
    }

    private boolean hasContact(String name){
        for(int i=0;i<this.contacts.size();i++) {
            if(this.contacts.get(i).getName().equals(name)) return true;
        }
        return false;
    }

    public boolean openMenu(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("---------------------------------");
        System.out.println("Mobile Phone app");
        System.out.println("Select:");
        System.out.println("1. to view all contacts.");
        System.out.println("2. to add contact.");
        System.out.println("3. to update a contact.");
        System.out.println("4. to remove a contact.");
        System.out.println("5. to find a contact");
        System.out.println("6. quit");
        System.out.print("Enter: ");
        choice = sc.nextInt();
        System.out.println("---------------------------------");
        String name = "";
        String phone = "";
        switch (choice){
            case 1:
                this.printContacts();
                break;
            case 2:
                System.out.println("Enter name: ");
                sc.nextLine();
                name = sc.nextLine();
                if(this.hasContact(name)) {System.out.println("Name already exists."); break;}
                System.out.println("Enter phone number: ");
                phone = sc.nextLine();
                this.newContact(name, phone);
                break;
            case 3:
                System.out.println("Enter name to update:" );
                sc.nextLine();
                name = sc.nextLine();
                if(hasContact(name)) {
                    System.out.println("Enter new name for contact: ");
                    String newname = sc.nextLine();
                    System.out.println("enter new phone for contact: ");
                    String newphone = sc.nextLine();
                    this.modifyContact(getByName(name), new Contact(newname, newphone));
                }
                else System.out.println("Name not found.");
                break;
            case 4:
                System.out.println("Enter contact name to remove: ");
                sc.nextLine();
                name = sc.nextLine();
                if(this.hasContact(name)) {
                    this.removeContact(name);
                    System.out.println("removed: " + name);
                }
                else System.out.println("Name not found.");
                break;
            case 5:
                sc.nextLine();
                System.out.println("Enter name to look up: ");
                name = sc.nextLine();
//                System.out.println(name);
                if(this.hasContact(name)) System.out.println(this.getByName(name).getContact());
                else System.out.println("Name not found.");
                break;
                case 6:
                    return false;
            default:
                System.out.println("Invalid option selected");
        }
    return true;
    }

}
