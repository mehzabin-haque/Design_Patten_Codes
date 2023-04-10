package FactoryMethod;

public class NonVegResturant extends Resturant{

    @Override
    public Burger createburger() {
        return new NonVeg();
    }
    
}
