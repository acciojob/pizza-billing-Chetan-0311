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
        int calBill = 0;
        if(isVeg){
            System.out.println("Base Price Of The Pizza: " + 300);
            calBill += 300;
        }
        else{
            System.out.println("Base Price Of The Pizza " + 400);
            calBill += 400;
        }

        if(extraCheese){
            System.out.println("Extra Cheese Added: " + 80);
            calBill += 80;
        }

        if(extraToppings){
            if(isVeg){
                System.out.println("Extra Toppings Added: " + 70);
                calBill += 70;
            }
            else{
                System.out.println("Extra Toppings Added: " + 120);
                calBill += 120;
            }
        }
        if(takeAway) {
            calBill += 20;
        }
        this.bill = "Total Price: " + String.valueOf(calBill);
        return this.bill;
    }
}
