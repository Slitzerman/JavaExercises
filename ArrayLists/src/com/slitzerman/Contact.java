package com.slitzerman;

/**
 * Created by Niko Pinnis on 1.2.2017
 * for project: ArrayLists.
 */
public class Contact {

    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getPhone() {
        return phone;
    }

//    public void setPhone(String phone) {
//        this.phone = phone;
//    }

    public String getContact(){

        return this.name + ", " + this.phone;

    }


}
