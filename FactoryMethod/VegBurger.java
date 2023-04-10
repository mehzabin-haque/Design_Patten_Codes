package FactoryMethod;

public class VegBurger implements Burger{

    @Override
    public void prepare() {
       System.out.println("Veg burger prepare");
    }
    
}
