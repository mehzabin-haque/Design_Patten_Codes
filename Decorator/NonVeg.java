package Decorator;

public class NonVeg implements Pizza {

    public void getDesc() {
        System.out.println("A non-veg pizza");
    }

    @Override
    public double getcost() {
        getDesc();
        return 15.00;
    }
    
}