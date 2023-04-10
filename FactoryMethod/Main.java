package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Resturant rt = new VegBurgerResturant();
        Resturant vt = new NonVegResturant();
        rt.orderBurger();
        vt.orderBurger();
    }
}
