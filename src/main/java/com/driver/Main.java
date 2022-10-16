package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza p = new DeluxePizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraToppings();
    p.addExtraCheese();
    p.getBill();
    p.getBill();
//    assertEquals( "Base Price Of The Pizza: 400\nExtra Cheese Added: 80\nExtra Toppings Added: 120\nTotal Price: 600\n", p.getBill());
    System.out.println(p.getBill());
//    DeluxePizza dp = new DeluxePizza(false);
//    dp.addTakeaway();
//    dp.addExtraCheese();
//    dp.addTakeaway();
//    System.out.println(dp.getBill());
//
//    Pizza p = new Pizza(true);
//    p.addExtraCheese();
//    p.addExtraToppings();
//    p.addTakeaway();
//    System.out.println(p.getBill());
  }
}