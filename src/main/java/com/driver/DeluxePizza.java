package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
//        Pizza deluxPizza = new Pizza(isVeg);
        addExtraCheese();
        addExtraToppings();
    }
}
