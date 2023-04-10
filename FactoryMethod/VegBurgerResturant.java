package FactoryMethod;

public class VegBurgerResturant extends Resturant{

    @Override
    public Burger createburger() {
        return new VegBurger();
    }
    
}
