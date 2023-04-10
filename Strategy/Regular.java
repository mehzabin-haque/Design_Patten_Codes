package Strategy;

public class Regular implements DiscountStrategy{

    @Override
    public double discount(double amount) {
        return amount*0.1;
    }
    
}