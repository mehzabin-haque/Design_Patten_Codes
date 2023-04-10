package FactoryMethod;

public abstract class Resturant {
    public Burger orderBurger(){
        Burger burger = createburger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createburger();
}
