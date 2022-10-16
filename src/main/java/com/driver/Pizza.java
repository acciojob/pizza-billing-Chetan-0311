package com.driver;

public class Pizza {

    private int price;
    private int toppings;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;
    private boolean isBillGenrated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }

        extraCheese = false;
        extraToppings = false;
        takeAway = false;
        isBillGenrated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese == false && extraToppings == false){
            price += 80;
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings == false){
            if(isVeg){
                price += 70;
            }
            else {
                price += 120;
            }
            extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAway == false){
            price += 20;
            takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenrated == false) {
            isBillGenrated = true;
            if (isVeg) {
                this.bill = "Base Price Of The Pizza: 300\n";
            } else {
                this.bill = "Base Price Of The Pizza: 400\n";
            }
            if (extraCheese) {
                this.bill += "Extra Cheese Added: 80\n";
            }
            if (extraToppings) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (takeAway) {
                this.bill += "Paper Bag Added: 20 \n";
            }
            this.bill += "Total Price: " + getPrice() + "\n";

        }
        return this.bill;
    }

}
