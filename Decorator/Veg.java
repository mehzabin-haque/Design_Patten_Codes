package Decorator;

public class Veg implements Pizza {

    public void getDesc() {
        System.out.println("A veg pizza"); 
    }

    @Override
    public double getcost() {
        getDesc();
        return 9.00;
    }
    
}
