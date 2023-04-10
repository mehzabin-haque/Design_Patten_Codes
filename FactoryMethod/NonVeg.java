package FactoryMethod;

public class NonVeg implements Burger{

    @Override
    public void prepare() {
       System.out.println("Non-Veg burger prepare");
    }
    
}
