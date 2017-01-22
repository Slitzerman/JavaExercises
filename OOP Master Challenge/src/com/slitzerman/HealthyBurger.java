package com.slitzerman;

/**
 * Created by Niko Pinnis on 16.1.2017
 * for project: OOP Master Challenge.
 */
public class HealthyBurger extends Hamburger{

    private String extraAddition1;
    private String extraAddition2;

    private double extraAdditionPrice;

    private int addCount;
    private int extraAddCount;

    public HealthyBurger(String meat) {
        super("Healthy Burger","Brown Rye", meat);
        this.extraAddition1 = "";
        this.extraAddition2 = "";
        this.extraAdditionPrice = 2.00;
        this.addCount  = 0;
        this.extraAddCount = 0;
    }

    public String getExtraAddition1() {
        return extraAddition1;
    }

    public String getExtraAddition2() {
        return extraAddition2;
    }

    @Override
    public int getAddCount() {
        return addCount;
    }

    @Override
    public double totalPrice(){
        return this.getBasePrice() + this.addCount * this.getAdditionPrice() + this.extraAddCount * this.extraAdditionPrice;
    }

    @Override
    public boolean addItem(String item, boolean isExtra) {
        if (this.addCount + this.extraAddCount == 6) {
            System.out.println("Burger already has 6 additions and can't have anymore.");
            return false;
        }
        else if ((this.addCount + this.extraAddCount) < 6 && (this.addCount + this.extraAddCount) >= 0) {
            if (isExtra) {
                switch (this.extraAddCount) {
                    case 0:
                        this.extraAddition1 = item;
                        this.extraAddCount++;
                        break;
                    case 1:
                        this.extraAddition2 = item;
                        this.extraAddCount++;
                        break;
                    case 2:
                        System.out.println(this.getName() + " already has 2 extra additions." );
                        if(this.addCount < 4) System.out.println("Would you like a normal addition instead?");
                        break;
                    default:
                        System.out.println("Error unexpected ExtraAddCount value: " + this.extraAddCount);
                }
            }
            else {
                switch (this.addCount) {
                    case 0:
                        this.setAddition1(item);
                        this.addCount++;
                        break;
                    case 1:
                        this.setAddition2(item);
                        this.addCount++;
                        break;
                    case 2:
                        this.setAddition3(item);
                        this.addCount++;
                        break;
                    case 3:
                        this.setAddition4(item);
                        this.addCount++;
                        break;
                    case 4:
                        System.out.println("Burger already has 4 basic additions and can't have anymore. Add an extra addition instead?");
                        break;
                    default:
                        System.out.println("Error at addItem: addCount is an invalid number." + this.addCount);
                        return false;

                }
            }

        }
        else{
            System.out.println("Error burger has items: " + (this.addCount + this.extraAddCount));
            return false;
        }
        return false;
    }

    @Override
    public void burgerDetails(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("This is a: " + this.getName());
        System.out.println("Base price of the burger is: " + this.getBasePrice());
        System.out.println("This burger has the following additions: ");
        if(this.getAddition1().length()>0) System.out.println(this.getAddition1());
        if(this.getAddition2().length()>0) System.out.println(this.getAddition2());
        if(this.getAddition3().length()>0) System.out.println(this.getAddition3());
        if(this.getAddition4().length()>0) System.out.println(this.getAddition4());
        System.out.println("Each basic addition costs: " + this.getAdditionPrice());
        System.out.println("Price of basic additions is: " + this.addCount * this.getAdditionPrice());
        System.out.println("This burger has the following extra additions: ");
        if(this.extraAddition1.length()>0) System.out.println(this.extraAddition1);
        if(this.extraAddition2.length()>0) System.out.println(this.extraAddition2);
        System.out.println("Each extra addition costs: " + this.extraAdditionPrice);
        System.out.println("Price of extra additions is: " + this.addCount * this.extraAdditionPrice);
        System.out.println("Total price is: " + this.totalPrice());
        System.out.println("-------------------------------------------------------------------");
    }

}
