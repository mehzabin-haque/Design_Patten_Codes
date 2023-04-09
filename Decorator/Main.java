package Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza veg = new Veg();
        Pizza crunchTopping = new ToppingPizzaDeco(new Veg());
        Pizza cheeseTopping = new ToppingPizzaDeco(new NonVeg());
        double v = veg.getcost();
        System.out.println("Total price without topping :" + v);
        System.out.println("________________");
        double a = crunchTopping.getcost();
        System.out.println("Total price with topping :" + a);
        
        System.out.println("________________");
        double b = cheeseTopping.getcost();
        System.out.println("Total price with topping :" + b);
        
    }
}
