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
        this.bill = "";
        int calBill = 0;
        if(isVeg){
            this.bill += "Base Price Of The Pizza: 300 \n";
            calBill += 300;
        }
        else{
            this.bill += "Base Price Of The Pizza: 400\n";
            calBill += 400;
        }

        if(extraCheese){
            this.bill += "Extra Cheese Added:  80\n";
            calBill += 80;
        }

        if(extraToppings){
            if(isVeg){
                this.bill += "Extra Toppings Added: 70\n";
                calBill += 70;
            }
            else{
                this.bill += "Extra Toppings Added: 120\n";
                System.out.println();
                calBill += 120;
            }
        }
        if(takeAway) {
            calBill += 20;
            this.bill += "Paperbag Added: 20\n";
        }

        this.bill = "Total Price: " + String.valueOf(calBill);
        return this.bill;
    }
}
