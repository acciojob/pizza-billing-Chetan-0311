package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addTakeaway();
//    assertEquals( 500, p.getPrice());
    System.out.println(p.getPrice());
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