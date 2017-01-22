package com.slitzerman;

/**
 * Created by Niko Pinnis on 16.1.2017
 * for project: OOP Master Challenge.
 */
public class Hamburger {

    private String name;

    private String breadRoll;
    private String meat;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;

    private int addCount;

    private double basePrice;
    private double additionPrice;

    public Hamburger(String name, String breadRoll, String meat) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = 1.00;
        this.addition1 = "";
        this.addition2 = "";
        this.addition3 = "";
        this.addition4 = "";
        this.addCount = 0;
        this.additionPrice = 1.00;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public String getAddition1() {
        return addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double totalPrice() {
        return basePrice + this.addCount * this.additionPrice;
    }

    public int getAddCount() {
        return addCount;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setAdditionPrice(double additionPrice) {
        this.additionPrice = additionPrice;
    }

    public boolean addItem(String item, boolean isExtra){
            switch (this.addCount){
                case 0:
                    addition1 = item;
                    this.addCount++;
                    break;
                case 1:
                    addition2 = item;
                    this.addCount++;
                    break;
                case 2:
                    addition3 = item;
                    this.addCount++;
                    break;
                case 3:
                    addition4 = item;
                    this.addCount++;
                    break;
                case 4:
                    System.out.println(this.name + " already has 4 additions and can't have anymore.");
                    return false;
                default:
                    System.out.println("Error at addItem: addCount is an invalid number.");
                    return false;
            }
            return true;
    }

    public boolean addItem(String item){
        if(this.addItem(item, false)) return true;
        else return false;
    }

    public void burgerDetails(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("This is a: " + this.name);
        System.out.println("Base price of the burger is: " + this.basePrice);
        System.out.println("This burger has the following additions: ");
        if(this.addition1.length()>0) System.out.println(this.addition1);
        if(this.addition2.length()>0) System.out.println(this.addition2);
        if(this.addition3.length()>0) System.out.println(this.addition3);
        if(this.addition4.length()>0) System.out.println(this.addition4);
        System.out.println("Each basic addition costs: " + this.additionPrice);
        System.out.println("Price of additions is: " + this.addCount * this.additionPrice);
        System.out.println("Total price is: " + this.totalPrice());
        System.out.println("-------------------------------------------------------------------");
    }

}
