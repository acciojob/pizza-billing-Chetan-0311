package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;
        }
        else {
            price = 400;
        }
        this.bill += "Base Price Of The Pizza: " + this.price + "\n";
        extraCheese = false;
        extraToppings = false;
        takeAway = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese == false && extraToppings == false){
            price += 80;
            extraCheese = true;
            this.bill += "Extra Cheese Added:  80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings == false){
            if(isVeg){
                price += 70;
                this.bill += "Extra Toppings Added: 70\n";
            }
            else {
                price += 120;
                this.bill += "Extra Toppings Added: 120\n";
            }
            extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAway == false){
            price += 20;
            takeAway = true;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: " + getPrice();
        return this.bill;
    }
}
